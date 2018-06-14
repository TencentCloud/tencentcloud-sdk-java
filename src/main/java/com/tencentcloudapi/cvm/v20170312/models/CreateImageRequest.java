package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateImageRequest  extends AbstractModel{


    /**
    * 需要制作镜像的实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像描述
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * 软关机失败时是否执行强制关机以制作镜像
    */
    @SerializedName("ForcePoweroff")
    @Expose
    private String ForcePoweroff;

    /**
    * 创建Windows镜像时是否启用Sysprep
    */
    @SerializedName("Sysprep")
    @Expose
    private String Sysprep;

    /**
    * 实例处于运行中时，是否允许关机执行制作镜像任务。
    */
    @SerializedName("Reboot")
    @Expose
    private String Reboot;

    /**
     * 获取需要制作镜像的实例ID
     * @return InstanceId 需要制作镜像的实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置需要制作镜像的实例ID
     * @param InstanceId 需要制作镜像的实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取镜像名称
     * @return ImageName 镜像名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * 设置镜像名称
     * @param ImageName 镜像名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * 获取镜像描述
     * @return ImageDescription 镜像描述
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * 设置镜像描述
     * @param ImageDescription 镜像描述
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * 获取软关机失败时是否执行强制关机以制作镜像
     * @return ForcePoweroff 软关机失败时是否执行强制关机以制作镜像
     */
    public String getForcePoweroff() {
        return this.ForcePoweroff;
    }

    /**
     * 设置软关机失败时是否执行强制关机以制作镜像
     * @param ForcePoweroff 软关机失败时是否执行强制关机以制作镜像
     */
    public void setForcePoweroff(String ForcePoweroff) {
        this.ForcePoweroff = ForcePoweroff;
    }

    /**
     * 获取创建Windows镜像时是否启用Sysprep
     * @return Sysprep 创建Windows镜像时是否启用Sysprep
     */
    public String getSysprep() {
        return this.Sysprep;
    }

    /**
     * 设置创建Windows镜像时是否启用Sysprep
     * @param Sysprep 创建Windows镜像时是否启用Sysprep
     */
    public void setSysprep(String Sysprep) {
        this.Sysprep = Sysprep;
    }

    /**
     * 获取实例处于运行中时，是否允许关机执行制作镜像任务。
     * @return Reboot 实例处于运行中时，是否允许关机执行制作镜像任务。
     */
    public String getReboot() {
        return this.Reboot;
    }

    /**
     * 设置实例处于运行中时，是否允许关机执行制作镜像任务。
     * @param Reboot 实例处于运行中时，是否允许关机执行制作镜像任务。
     */
    public void setReboot(String Reboot) {
        this.Reboot = Reboot;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "ForcePoweroff", this.ForcePoweroff);
        this.setParamSimple(map, prefix + "Sysprep", this.Sysprep);
        this.setParamSimple(map, prefix + "Reboot", this.Reboot);

    }
}

