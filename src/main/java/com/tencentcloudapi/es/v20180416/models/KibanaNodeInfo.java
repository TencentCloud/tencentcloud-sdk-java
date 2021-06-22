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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KibanaNodeInfo extends AbstractModel{

    /**
    * Kibana节点规格
    */
    @SerializedName("KibanaNodeType")
    @Expose
    private String KibanaNodeType;

    /**
    * Kibana节点个数
    */
    @SerializedName("KibanaNodeNum")
    @Expose
    private Long KibanaNodeNum;

    /**
    * Kibana节点CPU数
    */
    @SerializedName("KibanaNodeCpuNum")
    @Expose
    private Long KibanaNodeCpuNum;

    /**
    * Kibana节点内存GB
    */
    @SerializedName("KibanaNodeMemSize")
    @Expose
    private Long KibanaNodeMemSize;

    /**
    * Kibana节点磁盘类型
    */
    @SerializedName("KibanaNodeDiskType")
    @Expose
    private String KibanaNodeDiskType;

    /**
    * Kibana节点磁盘大小
    */
    @SerializedName("KibanaNodeDiskSize")
    @Expose
    private Long KibanaNodeDiskSize;

    /**
     * Get Kibana节点规格 
     * @return KibanaNodeType Kibana节点规格
     */
    public String getKibanaNodeType() {
        return this.KibanaNodeType;
    }

    /**
     * Set Kibana节点规格
     * @param KibanaNodeType Kibana节点规格
     */
    public void setKibanaNodeType(String KibanaNodeType) {
        this.KibanaNodeType = KibanaNodeType;
    }

    /**
     * Get Kibana节点个数 
     * @return KibanaNodeNum Kibana节点个数
     */
    public Long getKibanaNodeNum() {
        return this.KibanaNodeNum;
    }

    /**
     * Set Kibana节点个数
     * @param KibanaNodeNum Kibana节点个数
     */
    public void setKibanaNodeNum(Long KibanaNodeNum) {
        this.KibanaNodeNum = KibanaNodeNum;
    }

    /**
     * Get Kibana节点CPU数 
     * @return KibanaNodeCpuNum Kibana节点CPU数
     */
    public Long getKibanaNodeCpuNum() {
        return this.KibanaNodeCpuNum;
    }

    /**
     * Set Kibana节点CPU数
     * @param KibanaNodeCpuNum Kibana节点CPU数
     */
    public void setKibanaNodeCpuNum(Long KibanaNodeCpuNum) {
        this.KibanaNodeCpuNum = KibanaNodeCpuNum;
    }

    /**
     * Get Kibana节点内存GB 
     * @return KibanaNodeMemSize Kibana节点内存GB
     */
    public Long getKibanaNodeMemSize() {
        return this.KibanaNodeMemSize;
    }

    /**
     * Set Kibana节点内存GB
     * @param KibanaNodeMemSize Kibana节点内存GB
     */
    public void setKibanaNodeMemSize(Long KibanaNodeMemSize) {
        this.KibanaNodeMemSize = KibanaNodeMemSize;
    }

    /**
     * Get Kibana节点磁盘类型 
     * @return KibanaNodeDiskType Kibana节点磁盘类型
     */
    public String getKibanaNodeDiskType() {
        return this.KibanaNodeDiskType;
    }

    /**
     * Set Kibana节点磁盘类型
     * @param KibanaNodeDiskType Kibana节点磁盘类型
     */
    public void setKibanaNodeDiskType(String KibanaNodeDiskType) {
        this.KibanaNodeDiskType = KibanaNodeDiskType;
    }

    /**
     * Get Kibana节点磁盘大小 
     * @return KibanaNodeDiskSize Kibana节点磁盘大小
     */
    public Long getKibanaNodeDiskSize() {
        return this.KibanaNodeDiskSize;
    }

    /**
     * Set Kibana节点磁盘大小
     * @param KibanaNodeDiskSize Kibana节点磁盘大小
     */
    public void setKibanaNodeDiskSize(Long KibanaNodeDiskSize) {
        this.KibanaNodeDiskSize = KibanaNodeDiskSize;
    }

    public KibanaNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KibanaNodeInfo(KibanaNodeInfo source) {
        if (source.KibanaNodeType != null) {
            this.KibanaNodeType = new String(source.KibanaNodeType);
        }
        if (source.KibanaNodeNum != null) {
            this.KibanaNodeNum = new Long(source.KibanaNodeNum);
        }
        if (source.KibanaNodeCpuNum != null) {
            this.KibanaNodeCpuNum = new Long(source.KibanaNodeCpuNum);
        }
        if (source.KibanaNodeMemSize != null) {
            this.KibanaNodeMemSize = new Long(source.KibanaNodeMemSize);
        }
        if (source.KibanaNodeDiskType != null) {
            this.KibanaNodeDiskType = new String(source.KibanaNodeDiskType);
        }
        if (source.KibanaNodeDiskSize != null) {
            this.KibanaNodeDiskSize = new Long(source.KibanaNodeDiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KibanaNodeType", this.KibanaNodeType);
        this.setParamSimple(map, prefix + "KibanaNodeNum", this.KibanaNodeNum);
        this.setParamSimple(map, prefix + "KibanaNodeCpuNum", this.KibanaNodeCpuNum);
        this.setParamSimple(map, prefix + "KibanaNodeMemSize", this.KibanaNodeMemSize);
        this.setParamSimple(map, prefix + "KibanaNodeDiskType", this.KibanaNodeDiskType);
        this.setParamSimple(map, prefix + "KibanaNodeDiskSize", this.KibanaNodeDiskSize);

    }
}

