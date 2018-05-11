package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class AddDeviceRequest  extends AbstractModel{


    /**
    * 产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;
    

    /**
    * 设备名称，唯一标识某产品下的一个设备
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;
    

    /**
     * 获取产品Id
     * @return ProductId 产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * 设置产品Id
     * @param ProductId 产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * 获取设备名称，唯一标识某产品下的一个设备
     * @return DeviceName 设备名称，唯一标识某产品下的一个设备
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * 设置设备名称，唯一标识某产品下的一个设备
     * @param DeviceName 设备名称，唯一标识某产品下的一个设备
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);

    }
}

