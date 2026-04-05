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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KVNamespace extends AbstractModel {

    /**
    * 命名空间名称。在同站点下具有唯一性。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 命名空间描述。创建时填写的备注信息，用于说明命名空间的用途或业务含义。最大支持 256 个字符。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * KV 存储空间可用容量，单位为字节（Byte）。表示该命名空间可存储数据的最大容量上限，当前默认为 1 GB。
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
    * KV 存储空间已用容量，单位为字节（Byte）。表示该命名空间当前已使用的存储空间大小。
    */
    @SerializedName("CapacityUsed")
    @Expose
    private Long CapacityUsed;

    /**
    * 命名空间被引用实例的列表。展示当前命名空间被哪些边缘函数实例引用，以及引用的站点信息。若未被引用，则返回空数组。
    */
    @SerializedName("References")
    @Expose
    private ComponentReference [] References;

    /**
    * 命名空间的创建时间，遵循 ISO 8601 标准，格式为 YYYY-MM-DDThh:mm:ssZ（UTC 时间）。
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 命名空间的最后修改时间，遵循 ISO 8601 标准，格式为 YYYY-MM-DDThh:mm:ssZ（UTC 时间）。
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
     * Get 命名空间名称。在同站点下具有唯一性。 
     * @return Namespace 命名空间名称。在同站点下具有唯一性。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间名称。在同站点下具有唯一性。
     * @param Namespace 命名空间名称。在同站点下具有唯一性。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 命名空间描述。创建时填写的备注信息，用于说明命名空间的用途或业务含义。最大支持 256 个字符。 
     * @return Remark 命名空间描述。创建时填写的备注信息，用于说明命名空间的用途或业务含义。最大支持 256 个字符。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 命名空间描述。创建时填写的备注信息，用于说明命名空间的用途或业务含义。最大支持 256 个字符。
     * @param Remark 命名空间描述。创建时填写的备注信息，用于说明命名空间的用途或业务含义。最大支持 256 个字符。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get KV 存储空间可用容量，单位为字节（Byte）。表示该命名空间可存储数据的最大容量上限，当前默认为 1 GB。 
     * @return Capacity KV 存储空间可用容量，单位为字节（Byte）。表示该命名空间可存储数据的最大容量上限，当前默认为 1 GB。
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set KV 存储空间可用容量，单位为字节（Byte）。表示该命名空间可存储数据的最大容量上限，当前默认为 1 GB。
     * @param Capacity KV 存储空间可用容量，单位为字节（Byte）。表示该命名空间可存储数据的最大容量上限，当前默认为 1 GB。
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get KV 存储空间已用容量，单位为字节（Byte）。表示该命名空间当前已使用的存储空间大小。 
     * @return CapacityUsed KV 存储空间已用容量，单位为字节（Byte）。表示该命名空间当前已使用的存储空间大小。
     */
    public Long getCapacityUsed() {
        return this.CapacityUsed;
    }

    /**
     * Set KV 存储空间已用容量，单位为字节（Byte）。表示该命名空间当前已使用的存储空间大小。
     * @param CapacityUsed KV 存储空间已用容量，单位为字节（Byte）。表示该命名空间当前已使用的存储空间大小。
     */
    public void setCapacityUsed(Long CapacityUsed) {
        this.CapacityUsed = CapacityUsed;
    }

    /**
     * Get 命名空间被引用实例的列表。展示当前命名空间被哪些边缘函数实例引用，以及引用的站点信息。若未被引用，则返回空数组。 
     * @return References 命名空间被引用实例的列表。展示当前命名空间被哪些边缘函数实例引用，以及引用的站点信息。若未被引用，则返回空数组。
     */
    public ComponentReference [] getReferences() {
        return this.References;
    }

    /**
     * Set 命名空间被引用实例的列表。展示当前命名空间被哪些边缘函数实例引用，以及引用的站点信息。若未被引用，则返回空数组。
     * @param References 命名空间被引用实例的列表。展示当前命名空间被哪些边缘函数实例引用，以及引用的站点信息。若未被引用，则返回空数组。
     */
    public void setReferences(ComponentReference [] References) {
        this.References = References;
    }

    /**
     * Get 命名空间的创建时间，遵循 ISO 8601 标准，格式为 YYYY-MM-DDThh:mm:ssZ（UTC 时间）。 
     * @return CreatedOn 命名空间的创建时间，遵循 ISO 8601 标准，格式为 YYYY-MM-DDThh:mm:ssZ（UTC 时间）。
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 命名空间的创建时间，遵循 ISO 8601 标准，格式为 YYYY-MM-DDThh:mm:ssZ（UTC 时间）。
     * @param CreatedOn 命名空间的创建时间，遵循 ISO 8601 标准，格式为 YYYY-MM-DDThh:mm:ssZ（UTC 时间）。
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 命名空间的最后修改时间，遵循 ISO 8601 标准，格式为 YYYY-MM-DDThh:mm:ssZ（UTC 时间）。 
     * @return ModifiedOn 命名空间的最后修改时间，遵循 ISO 8601 标准，格式为 YYYY-MM-DDThh:mm:ssZ（UTC 时间）。
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set 命名空间的最后修改时间，遵循 ISO 8601 标准，格式为 YYYY-MM-DDThh:mm:ssZ（UTC 时间）。
     * @param ModifiedOn 命名空间的最后修改时间，遵循 ISO 8601 标准，格式为 YYYY-MM-DDThh:mm:ssZ（UTC 时间）。
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    public KVNamespace() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KVNamespace(KVNamespace source) {
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Capacity != null) {
            this.Capacity = new Long(source.Capacity);
        }
        if (source.CapacityUsed != null) {
            this.CapacityUsed = new Long(source.CapacityUsed);
        }
        if (source.References != null) {
            this.References = new ComponentReference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new ComponentReference(source.References[i]);
            }
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);
        this.setParamSimple(map, prefix + "CapacityUsed", this.CapacityUsed);
        this.setParamArrayObj(map, prefix + "References.", this.References);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);

    }
}

