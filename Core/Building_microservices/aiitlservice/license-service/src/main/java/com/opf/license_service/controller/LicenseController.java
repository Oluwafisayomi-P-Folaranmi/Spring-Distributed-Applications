package com.opf.license_service.controller;

import com.opf.license_service.model.License;
import com.opf.license_service.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@RequestMapping(value = "v1/organization/{organizationId}/license")
public class LicenseController {

    @Autowired
    private LicenseService licenseService;

    // GET v1/organization/{organizationId}/license/{licenseId}
    @GetMapping(value="/{licenseId}")
    public ResponseEntity<License> getLicense(
            @PathVariable("organizationId") String organizationId,
            @PathVariable("licenseId") String licenseId) {

        License license = licenseService
                .getLicense(licenseId, organizationId);
        return ResponseEntity.ok(license);
    }

    // POST // v1/organization/{organizationId}/license/
    @PostMapping
    public ResponseEntity<String> createLicense(
            @PathVariable("organizationId") String organizationId,
            @RequestBody License request,
            @RequestHeader(value = "Accept-Language", required = false) Locale locale) {

        return ResponseEntity.ok(
                licenseService.createLicense(
                        request, organizationId, locale));

    }

    // PUT v1/organization/{organizationId}/license/
    @PutMapping
    public ResponseEntity<String> updateLicense(
            @PathVariable("organizationId") String organizationId,
            @RequestBody License request,
            @RequestHeader(value = "Accept-Language", required = false) Locale locale)
    {

        return ResponseEntity.ok(
                licenseService.updateLicense(
                        request, organizationId, locale));

    }

    // DELETE // v1/organization/{organizationId}/license/{licenseId}
    @DeleteMapping(value="/{licenseId}")
    public ResponseEntity<String> deleteLicense(
            @PathVariable("organizationId") String organizationId,
            @PathVariable("licenseId") String licenseId) {

        return ResponseEntity.ok(licenseService.deleteLicense(licenseId,
                organizationId));

    }
}
