/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.redhat.appdev;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-04-08T13:34:57.043-03:00[America/Argentina/Buenos_Aires]")

@Validated
@Api(value = "api", description = "the api API")
public interface ApiApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /api/casos/covid19
     * getCasosByProvincia
     *
     * @param idProvincia  (required)
     * @return listado de casos (status code 200)
     */
    @ApiOperation(value = "", nickname = "apiCasosCovid19Get", notes = "getCasosByProvincia", response = Object.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "listado de casos", response = Object.class, responseContainer = "List") })
    @RequestMapping(value = "/api/casos/covid19",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Object>> apiCasosCovid19Get(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "idProvincia", required = true) String idProvincia) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = null;
                    if (idProvincia.equals("1")) {
                        exampleString = "CABA";
                    } 
                    if (idProvincia.equals("2")) {
                        exampleString = "Buenos Aires";
                    }                    
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
