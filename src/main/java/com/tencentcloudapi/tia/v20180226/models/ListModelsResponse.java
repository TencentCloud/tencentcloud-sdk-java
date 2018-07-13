package com.tencentcloudapi.tia.v20180226.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ListModelsResponse  extends AbstractModel{


    /**
    * Model数组，用以显示所有模型的信息
    */
    @SerializedName("Models")
    @Expose
    private Model [] Models;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取Model数组，用以显示所有模型的信息
     * @return Models Model数组，用以显示所有模型的信息
     */
    public Model [] getModels() {
        return this.Models;
    }

    /**
     * 设置Model数组，用以显示所有模型的信息
     * @param Models Model数组，用以显示所有模型的信息
     */
    public void setModels(Model [] Models) {
        this.Models = Models;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Models.", this.Models);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

