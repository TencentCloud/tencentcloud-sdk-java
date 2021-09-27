/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetDiskPartitionInfo extends AbstractModel{

    /**
    * 分区名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分区大小：单位G
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 分区使用率
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
    * 文件系统类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 挂载目录
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 已使用空间：单位G
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
     * Get 分区名 
     * @return Name 分区名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分区名
     * @param Name 分区名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分区大小：单位G 
     * @return Size 分区大小：单位G
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 分区大小：单位G
     * @param Size 分区大小：单位G
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 分区使用率 
     * @return Percent 分区使用率
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * Set 分区使用率
     * @param Percent 分区使用率
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 文件系统类型 
     * @return Type 文件系统类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 文件系统类型
     * @param Type 文件系统类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 挂载目录 
     * @return Path 挂载目录
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 挂载目录
     * @param Path 挂载目录
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 已使用空间：单位G 
     * @return Used 已使用空间：单位G
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set 已使用空间：单位G
     * @param Used 已使用空间：单位G
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    public AssetDiskPartitionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetDiskPartitionInfo(AssetDiskPartitionInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Percent != null) {
            this.Percent = new Float(source.Percent);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Used != null) {
            this.Used = new Long(source.Used);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Used", this.Used);

    }
}

