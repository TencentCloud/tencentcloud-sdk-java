package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeImportImageOsResponse  extends AbstractModel{


    /**
    * 支持的导入镜像的操作系统类型
    */
    @SerializedName("ImportImageOsListSupported")
    @Expose
    private String [] ImportImageOsListSupported;
    

    /**
    * 支持的导入镜像的操作系统版本
    */
    @SerializedName("ImportImageOsVersionSupported")
    @Expose
    private String [] ImportImageOsVersionSupported;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取支持的导入镜像的操作系统类型
     * @return ImportImageOsListSupported 支持的导入镜像的操作系统类型
     */
    public String [] getImportImageOsListSupported() {
        return this.ImportImageOsListSupported;
    }

    /**
     * 设置支持的导入镜像的操作系统类型
     * @param ImportImageOsListSupported 支持的导入镜像的操作系统类型
     */
    public void setImportImageOsListSupported(String [] ImportImageOsListSupported) {
        this.ImportImageOsListSupported = ImportImageOsListSupported;
    }

    /**
     * 获取支持的导入镜像的操作系统版本
     * @return ImportImageOsVersionSupported 支持的导入镜像的操作系统版本
     */
    public String [] getImportImageOsVersionSupported() {
        return this.ImportImageOsVersionSupported;
    }

    /**
     * 设置支持的导入镜像的操作系统版本
     * @param ImportImageOsVersionSupported 支持的导入镜像的操作系统版本
     */
    public void setImportImageOsVersionSupported(String [] ImportImageOsVersionSupported) {
        this.ImportImageOsVersionSupported = ImportImageOsVersionSupported;
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
        this.setParamArraySimple(map, prefix + "ImportImageOsListSupported.", this.ImportImageOsListSupported);
        this.setParamArraySimple(map, prefix + "ImportImageOsVersionSupported.", this.ImportImageOsVersionSupported);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

