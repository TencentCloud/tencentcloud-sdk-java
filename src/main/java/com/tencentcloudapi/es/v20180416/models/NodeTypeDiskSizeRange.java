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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeTypeDiskSizeRange extends AbstractModel {

    /**
    * 机器类型
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 节点类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 磁盘类型
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 磁盘最小值
    */
    @SerializedName("Min")
    @Expose
    private Long Min;

    /**
    * 中刻度值
    */
    @SerializedName("Med")
    @Expose
    private Long Med;

    /**
    * 磁盘最大值
    */
    @SerializedName("Max")
    @Expose
    private Long Max;

    /**
    * 磁盘最小个数
    */
    @SerializedName("DiskCountMin")
    @Expose
    private Long DiskCountMin;

    /**
    * 磁盘最大个数
    */
    @SerializedName("DiskCountMax")
    @Expose
    private Long DiskCountMax;

    /**
    * 是否加密盘
    */
    @SerializedName("DiskEncrypt")
    @Expose
    private Long DiskEncrypt;

    /**
    * 是否增强
    */
    @SerializedName("DiskEnhance")
    @Expose
    private Long DiskEnhance;

    /**
    * 是否lvm
    */
    @SerializedName("IsLvm")
    @Expose
    private Long IsLvm;

    /**
    * 是否本地盘
    */
    @SerializedName("IsLocalDiskType")
    @Expose
    private Boolean IsLocalDiskType;

    /**
     * Get 机器类型 
     * @return NodeType 机器类型
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 机器类型
     * @param NodeType 机器类型
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 节点类型 
     * @return Type 节点类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 节点类型
     * @param Type 节点类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 磁盘类型 
     * @return DiskType 磁盘类型
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 磁盘类型
     * @param DiskType 磁盘类型
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 磁盘最小值 
     * @return Min 磁盘最小值
     */
    public Long getMin() {
        return this.Min;
    }

    /**
     * Set 磁盘最小值
     * @param Min 磁盘最小值
     */
    public void setMin(Long Min) {
        this.Min = Min;
    }

    /**
     * Get 中刻度值 
     * @return Med 中刻度值
     */
    public Long getMed() {
        return this.Med;
    }

    /**
     * Set 中刻度值
     * @param Med 中刻度值
     */
    public void setMed(Long Med) {
        this.Med = Med;
    }

    /**
     * Get 磁盘最大值 
     * @return Max 磁盘最大值
     */
    public Long getMax() {
        return this.Max;
    }

    /**
     * Set 磁盘最大值
     * @param Max 磁盘最大值
     */
    public void setMax(Long Max) {
        this.Max = Max;
    }

    /**
     * Get 磁盘最小个数 
     * @return DiskCountMin 磁盘最小个数
     */
    public Long getDiskCountMin() {
        return this.DiskCountMin;
    }

    /**
     * Set 磁盘最小个数
     * @param DiskCountMin 磁盘最小个数
     */
    public void setDiskCountMin(Long DiskCountMin) {
        this.DiskCountMin = DiskCountMin;
    }

    /**
     * Get 磁盘最大个数 
     * @return DiskCountMax 磁盘最大个数
     */
    public Long getDiskCountMax() {
        return this.DiskCountMax;
    }

    /**
     * Set 磁盘最大个数
     * @param DiskCountMax 磁盘最大个数
     */
    public void setDiskCountMax(Long DiskCountMax) {
        this.DiskCountMax = DiskCountMax;
    }

    /**
     * Get 是否加密盘 
     * @return DiskEncrypt 是否加密盘
     */
    public Long getDiskEncrypt() {
        return this.DiskEncrypt;
    }

    /**
     * Set 是否加密盘
     * @param DiskEncrypt 是否加密盘
     */
    public void setDiskEncrypt(Long DiskEncrypt) {
        this.DiskEncrypt = DiskEncrypt;
    }

    /**
     * Get 是否增强 
     * @return DiskEnhance 是否增强
     */
    public Long getDiskEnhance() {
        return this.DiskEnhance;
    }

    /**
     * Set 是否增强
     * @param DiskEnhance 是否增强
     */
    public void setDiskEnhance(Long DiskEnhance) {
        this.DiskEnhance = DiskEnhance;
    }

    /**
     * Get 是否lvm 
     * @return IsLvm 是否lvm
     */
    public Long getIsLvm() {
        return this.IsLvm;
    }

    /**
     * Set 是否lvm
     * @param IsLvm 是否lvm
     */
    public void setIsLvm(Long IsLvm) {
        this.IsLvm = IsLvm;
    }

    /**
     * Get 是否本地盘 
     * @return IsLocalDiskType 是否本地盘
     */
    public Boolean getIsLocalDiskType() {
        return this.IsLocalDiskType;
    }

    /**
     * Set 是否本地盘
     * @param IsLocalDiskType 是否本地盘
     */
    public void setIsLocalDiskType(Boolean IsLocalDiskType) {
        this.IsLocalDiskType = IsLocalDiskType;
    }

    public NodeTypeDiskSizeRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeTypeDiskSizeRange(NodeTypeDiskSizeRange source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.Min != null) {
            this.Min = new Long(source.Min);
        }
        if (source.Med != null) {
            this.Med = new Long(source.Med);
        }
        if (source.Max != null) {
            this.Max = new Long(source.Max);
        }
        if (source.DiskCountMin != null) {
            this.DiskCountMin = new Long(source.DiskCountMin);
        }
        if (source.DiskCountMax != null) {
            this.DiskCountMax = new Long(source.DiskCountMax);
        }
        if (source.DiskEncrypt != null) {
            this.DiskEncrypt = new Long(source.DiskEncrypt);
        }
        if (source.DiskEnhance != null) {
            this.DiskEnhance = new Long(source.DiskEnhance);
        }
        if (source.IsLvm != null) {
            this.IsLvm = new Long(source.IsLvm);
        }
        if (source.IsLocalDiskType != null) {
            this.IsLocalDiskType = new Boolean(source.IsLocalDiskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Med", this.Med);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "DiskCountMin", this.DiskCountMin);
        this.setParamSimple(map, prefix + "DiskCountMax", this.DiskCountMax);
        this.setParamSimple(map, prefix + "DiskEncrypt", this.DiskEncrypt);
        this.setParamSimple(map, prefix + "DiskEnhance", this.DiskEnhance);
        this.setParamSimple(map, prefix + "IsLvm", this.IsLvm);
        this.setParamSimple(map, prefix + "IsLocalDiskType", this.IsLocalDiskType);

    }
}

