package mobile;

import java.util.Map;

import javax.el.ValueExpression;

import oracle.adfmf.amx.event.ActionEvent;
import oracle.adfmf.bindings.dbf.AmxCollectionModel;
import oracle.adfmf.framework.api.AdfmfJavaUtilities;

public class AnalyticsBean {
    public AnalyticsBean() {
    }

    public void execute(ActionEvent actionEvent) {
        ValueExpression ve =
            AdfmfJavaUtilities.getValueExpression("#{bindings.features.collectionModel}", AmxCollectionModel.class);
        AmxCollectionModel model = (AmxCollectionModel)ve.getValue(AdfmfJavaUtilities.getAdfELContext());
        System.out.println("coming here");

    }
}
