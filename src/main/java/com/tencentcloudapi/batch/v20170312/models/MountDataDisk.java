package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class MountDataDisk  extends AbstractModel{


    /**
    * 文件系统类型，Linux系统下支持"EXT3"和"EXT4"两种，默认"EXT3"；Windows系统下仅支持"NTFS"
    */
    @SerializedName("FileSystemType")
    @Expose
    private String FileSystemType;
    

    /**
    * 挂载点，Linux系统合法路径，或Windows系统盘符,比如"H:\\"
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;
    

    /**
     * 获取文件系统类型，Linux系统下支持"EXT3"和"EXT4"两种，默认"EXT3"；Windows系统下仅支持"NTFS"
     * @return FileSystemType 文件系统类型，Linux系统下支持"EXT3"和"EXT4"两种，默认"EXT3"；Windows系统下仅支持"NTFS"
     */
    public String getFileSystemType() {
        return this.FileSystemType;
    }

    /**
     * 设置文件系统类型，Linux系统下支持"EXT3"和"EXT4"两种，默认"EXT3"；Windows系统下仅支持"NTFS"
     * @param FileSystemType 文件系统类型，Linux系统下支持"EXT3"和"EXT4"两种，默认"EXT3"；Windows系统下仅支持"NTFS"
     */
    public void setFileSystemType(String FileSystemType) {
        this.FileSystemType = FileSystemType;
    }

    /**
     * 获取挂载点，Linux系统合法路径，或Windows系统盘符,比如"H:\\"
     * @return LocalPath 挂载点，Linux系统合法路径，或Windows系统盘符,比如"H:\\"
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * 设置挂载点，Linux系统合法路径，或Windows系统盘符,比如"H:\\"
     * @param LocalPath 挂载点，Linux系统合法路径，或Windows系统盘符,比如"H:\\"
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemType", this.FileSystemType);
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);

    }
}

