package br.com.dbserver.assembleia.servico;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.dbserver.assembleia.dto.UsuarioDTO;


@FeignClient(name = "usuarioInformacaoService", url = "${user.info.url}")
public interface UsuarioInformacaoService {

    @GetMapping("/{cpf}")
    public ResponseEntity<UsuarioDTO> cpfValido(@PathVariable String cpf);

}