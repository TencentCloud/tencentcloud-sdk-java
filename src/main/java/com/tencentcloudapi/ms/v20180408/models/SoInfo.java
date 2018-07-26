package com.tencentcloudapi.ms.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class SoInfo  extends AbstractModel{


    /**
    * so文件列表
    */
    @SerializedName("SoFileNames")
    @Expose
    private String [] SoFileNames;

    /**
     * 获取so文件列表
     * @return SoFileNames so文件列表
     */
    public String [] getSoFileNames() {
        return this.SoFileNames;
    }

    /**
     * 设置so文件列表
     * @param SoFileNames so文件列表
     */
    public void setSoFileNames(String [] SoFileNames) {
        this.SoFileNames = SoFileNames;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SoFileNames.", this.SoFileNames);

    }
}

