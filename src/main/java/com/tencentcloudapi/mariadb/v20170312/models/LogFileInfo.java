package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class LogFileInfo  extends AbstractModel{


    /**
    * Log最后修改时间
    */
    @SerializedName("Mtime")
    @Expose
    private Integer Mtime;
    

    /**
    * 文件长度
    */
    @SerializedName("Length")
    @Expose
    private Integer Length;
    

    /**
    * 下载Log时用到的统一资源标识符
    */
    @SerializedName("Uri")
    @Expose
    private Integer Uri;
    

    /**
     * 获取Log最后修改时间
     * @return Mtime Log最后修改时间
     */
    public Integer getMtime() {
        return this.Mtime;
    }

    /**
     * 设置Log最后修改时间
     * @param Mtime Log最后修改时间
     */
    public void setMtime(Integer Mtime) {
        this.Mtime = Mtime;
    }

    /**
     * 获取文件长度
     * @return Length 文件长度
     */
    public Integer getLength() {
        return this.Length;
    }

    /**
     * 设置文件长度
     * @param Length 文件长度
     */
    public void setLength(Integer Length) {
        this.Length = Length;
    }

    /**
     * 获取下载Log时用到的统一资源标识符
     * @return Uri 下载Log时用到的统一资源标识符
     */
    public Integer getUri() {
        return this.Uri;
    }

    /**
     * 设置下载Log时用到的统一资源标识符
     * @param Uri 下载Log时用到的统一资源标识符
     */
    public void setUri(Integer Uri) {
        this.Uri = Uri;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mtime", this.Mtime);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "Uri", this.Uri);

    }
}

