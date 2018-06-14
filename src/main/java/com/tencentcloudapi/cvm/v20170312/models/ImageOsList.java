package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ImageOsList  extends AbstractModel{


    /**
    * 支持的windows操作系统。
    */
    @SerializedName("Windows")
    @Expose
    private String [] Windows;

    /**
    * 支持的linux操作系统
    */
    @SerializedName("Linux")
    @Expose
    private String [] Linux;

    /**
     * 获取支持的windows操作系统。
     * @return Windows 支持的windows操作系统。
     */
    public String [] getWindows() {
        return this.Windows;
    }

    /**
     * 设置支持的windows操作系统。
     * @param Windows 支持的windows操作系统。
     */
    public void setWindows(String [] Windows) {
        this.Windows = Windows;
    }

    /**
     * 获取支持的linux操作系统
     * @return Linux 支持的linux操作系统
     */
    public String [] getLinux() {
        return this.Linux;
    }

    /**
     * 设置支持的linux操作系统
     * @param Linux 支持的linux操作系统
     */
    public void setLinux(String [] Linux) {
        this.Linux = Linux;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Windows.", this.Windows);
        this.setParamArraySimple(map, prefix + "Linux.", this.Linux);

    }
}

