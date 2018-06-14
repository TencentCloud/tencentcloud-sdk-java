package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Application  extends AbstractModel{


    /**
    * 任务执行命令
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 应用程序的交付方式，包括PACKAGE、LOCAL 两种取值，分别指远程存储的软件包、计算环境本地。
    */
    @SerializedName("DeliveryForm")
    @Expose
    private String DeliveryForm;

    /**
    * 应用程序软件包的远程存储路径
    */
    @SerializedName("PackagePath")
    @Expose
    private String PackagePath;

    /**
    * 应用使用Docker的相关配置。在使用Docker配置的情况下，DeliveryForm 为 LOCAL 表示直接使用Docker镜像内部的应用软件，通过Docker方式运行；DeliveryForm 为 PACKAGE，表示将远程应用包注入到Docker镜像后，通过Docker方式运行。为避免Docker不同版本的兼容性问题，Docker安装包及相关依赖由Batch统一负责，对于已安装Docker的自定义镜像，请卸载后再使用Docker特性。
    */
    @SerializedName("Docker")
    @Expose
    private Docker Docker;

    /**
     * 获取任务执行命令
     * @return Command 任务执行命令
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * 设置任务执行命令
     * @param Command 任务执行命令
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * 获取应用程序的交付方式，包括PACKAGE、LOCAL 两种取值，分别指远程存储的软件包、计算环境本地。
     * @return DeliveryForm 应用程序的交付方式，包括PACKAGE、LOCAL 两种取值，分别指远程存储的软件包、计算环境本地。
     */
    public String getDeliveryForm() {
        return this.DeliveryForm;
    }

    /**
     * 设置应用程序的交付方式，包括PACKAGE、LOCAL 两种取值，分别指远程存储的软件包、计算环境本地。
     * @param DeliveryForm 应用程序的交付方式，包括PACKAGE、LOCAL 两种取值，分别指远程存储的软件包、计算环境本地。
     */
    public void setDeliveryForm(String DeliveryForm) {
        this.DeliveryForm = DeliveryForm;
    }

    /**
     * 获取应用程序软件包的远程存储路径
     * @return PackagePath 应用程序软件包的远程存储路径
     */
    public String getPackagePath() {
        return this.PackagePath;
    }

    /**
     * 设置应用程序软件包的远程存储路径
     * @param PackagePath 应用程序软件包的远程存储路径
     */
    public void setPackagePath(String PackagePath) {
        this.PackagePath = PackagePath;
    }

    /**
     * 获取应用使用Docker的相关配置。在使用Docker配置的情况下，DeliveryForm 为 LOCAL 表示直接使用Docker镜像内部的应用软件，通过Docker方式运行；DeliveryForm 为 PACKAGE，表示将远程应用包注入到Docker镜像后，通过Docker方式运行。为避免Docker不同版本的兼容性问题，Docker安装包及相关依赖由Batch统一负责，对于已安装Docker的自定义镜像，请卸载后再使用Docker特性。
     * @return Docker 应用使用Docker的相关配置。在使用Docker配置的情况下，DeliveryForm 为 LOCAL 表示直接使用Docker镜像内部的应用软件，通过Docker方式运行；DeliveryForm 为 PACKAGE，表示将远程应用包注入到Docker镜像后，通过Docker方式运行。为避免Docker不同版本的兼容性问题，Docker安装包及相关依赖由Batch统一负责，对于已安装Docker的自定义镜像，请卸载后再使用Docker特性。
     */
    public Docker getDocker() {
        return this.Docker;
    }

    /**
     * 设置应用使用Docker的相关配置。在使用Docker配置的情况下，DeliveryForm 为 LOCAL 表示直接使用Docker镜像内部的应用软件，通过Docker方式运行；DeliveryForm 为 PACKAGE，表示将远程应用包注入到Docker镜像后，通过Docker方式运行。为避免Docker不同版本的兼容性问题，Docker安装包及相关依赖由Batch统一负责，对于已安装Docker的自定义镜像，请卸载后再使用Docker特性。
     * @param Docker 应用使用Docker的相关配置。在使用Docker配置的情况下，DeliveryForm 为 LOCAL 表示直接使用Docker镜像内部的应用软件，通过Docker方式运行；DeliveryForm 为 PACKAGE，表示将远程应用包注入到Docker镜像后，通过Docker方式运行。为避免Docker不同版本的兼容性问题，Docker安装包及相关依赖由Batch统一负责，对于已安装Docker的自定义镜像，请卸载后再使用Docker特性。
     */
    public void setDocker(Docker Docker) {
        this.Docker = Docker;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "DeliveryForm", this.DeliveryForm);
        this.setParamSimple(map, prefix + "PackagePath", this.PackagePath);
        this.setParamObj(map, prefix + "Docker.", this.Docker);

    }
}

