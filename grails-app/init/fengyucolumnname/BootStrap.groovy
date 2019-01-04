package fengyucolumnname

import org.hibernate.SessionFactory
import org.hibernate.persister.entity.AbstractEntityPersister

class BootStrap {

    SessionFactory sessionFactory

    def init = { servletContext ->
        final AbstractEntityPersister classMetadata = (AbstractEntityPersister) sessionFactory.getClassMetadata(Widget)
        final String[] widthNames = classMetadata.getPropertyColumnNames('width')
        final String[] heightNames = classMetadata.getPropertyColumnNames('height')
        final String[] ownerFirstNameNames = classMetadata.getPropertyColumnNames('ownerFirstName')

        log.info "Width Names: $widthNames"
        log.info "Height Names: $heightNames"
        log.info "Owner First Name Names: $ownerFirstNameNames"
    }

    def destroy = {
    }
}
