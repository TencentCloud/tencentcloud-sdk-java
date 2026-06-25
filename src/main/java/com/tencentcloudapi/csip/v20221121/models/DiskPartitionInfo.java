/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskPartitionInfo extends AbstractModel {

    /**
    * <p>分区名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>挂载路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>使用百分比</p>
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
    * <p>分区大小(MB)</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>分区类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>已使用(MB)</p>
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
     * Get <p>分区名称</p> 
     * @return Name <p>分区名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>分区名称</p>
     * @param Name <p>分区名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>挂载路径</p> 
     * @return Path <p>挂载路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>挂载路径</p>
     * @param Path <p>挂载路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>使用百分比</p> 
     * @return Percent <p>使用百分比</p>
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * Set <p>使用百分比</p>
     * @param Percent <p>使用百分比</p>
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    /**
     * Get <p>分区大小(MB)</p> 
     * @return Size <p>分区大小(MB)</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>分区大小(MB)</p>
     * @param Size <p>分区大小(MB)</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>分区类型</p> 
     * @return Type <p>分区类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>分区类型</p>
     * @param Type <p>分区类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>已使用(MB)</p> 
     * @return Used <p>已使用(MB)</p>
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set <p>已使用(MB)</p>
     * @param Used <p>已使用(MB)</p>
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    public DiskPartitionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskPartitionInfo(DiskPartitionInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Percent != null) {
            this.Percent = new Float(source.Percent);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Used", this.Used);

    }
}

