    package Loja_online.Loja_online.controller;

    import Loja_online.Loja_online.entity.Pessoas;
    import Loja_online.Loja_online.service.PessoasService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.CrossOrigin;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    import java.util.List;

    @CrossOrigin
    @RequestMapping("/api/Pessoas")
    @RestController
    public class PessoasControler {

        @Autowired
        private PessoasService pessoasService;

        @GetMapping("/")
        public ResponseEntity<List<Pessoas>>listarPessoas(){
            List<Pessoas> pessoa= pessoasService.listarPessoas();
                return ResponseEntity.ok(pessoa);
            }

    }
