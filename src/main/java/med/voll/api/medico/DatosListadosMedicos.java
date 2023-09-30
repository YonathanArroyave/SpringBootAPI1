package med.voll.api.medico;

public record DatosListadosMedicos(Long id, String nombre, String especialidad, String documento, String email) {

    public DatosListadosMedicos(Medico medico){
        this(medico.getId(), medico.getNombre(), medico.getEspecialidad().toString(), medico.getDocumento(), medico.getEmail());

    }
}
