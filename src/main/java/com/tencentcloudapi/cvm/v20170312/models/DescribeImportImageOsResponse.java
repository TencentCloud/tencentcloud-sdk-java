package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeImportImageOsResponse  extends AbstractModel{


    /**
    * 支持的导入镜像的操作系统类型。
    */
    @SerializedName("ImportImageOsListSupported")
    @Expose
    private ImageOsList ImportImageOsListSupported;

    /**
    * 支持的导入镜像的操作系统版本。
    */
    @SerializedName("ImportImageOsVersionSet")
    @Expose
    private OsVersion [] ImportImageOsVersionSet;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取支持的导入镜像的操作系统类型。
     * @return ImportImageOsListSupported 支持的导入镜像的操作系统类型。
     */
    public ImageOsList getImportImageOsListSupported() {
        return this.ImportImageOsListSupported;
    }

    /**
     * 设置支持的导入镜像的操作系统类型。
     * @param ImportImageOsListSupported 支持的导入镜像的操作系统类型。
     */
    public void setImportImageOsListSupported(ImageOsList ImportImageOsListSupported) {
        this.ImportImageOsListSupported = ImportImageOsListSupported;
    }

    /**
     * 获取支持的导入镜像的操作系统版本。
     * @return ImportImageOsVersionSet 支持的导入镜像的操作系统版本。
     */
    public OsVersion [] getImportImageOsVersionSet() {
        return this.ImportImageOsVersionSet;
    }

    /**
     * 设置支持的导入镜像的操作系统版本。
     * @param ImportImageOsVersionSet 支持的导入镜像的操作系统版本。
     */
    public void setImportImageOsVersionSet(OsVersion [] ImportImageOsVersionSet) {
        this.ImportImageOsVersionSet = ImportImageOsVersionSet;
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
        this.setParamObj(map, prefix + "ImportImageOsListSupported.", this.ImportImageOsListSupported);
        this.setParamArrayObj(map, prefix + "ImportImageOsVersionSet.", this.ImportImageOsVersionSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

