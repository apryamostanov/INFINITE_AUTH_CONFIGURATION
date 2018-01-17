package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Url
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_url_repository
import org.springframework.stereotype.Component

@Component
class G07_UrlGenerator {

    void generate_data(I_url_repository p_url_repository) {
        Set<Url> l_entity_set = new HashSet<Url>()
        l_entity_set.add(new Url(urlName: "/%ACCESSORID%/*/*/*"))
        p_url_repository.save(l_entity_set)
    }


}
