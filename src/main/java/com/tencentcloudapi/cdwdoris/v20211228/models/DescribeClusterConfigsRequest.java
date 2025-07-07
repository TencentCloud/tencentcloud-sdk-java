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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterConfigsRequest extends AbstractModel {

    /**
    * 集群实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    *  0 公有云查询；1青鹅查询，青鹅查询显示所有需要展示的
    */
    @SerializedName("ConfigType")
    @Expose
    private Long ConfigType;

    /**
    * 模糊搜索关键字文件
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 0集群维度 1节点维度 2启动脚本 3计算组维度
    */
    @SerializedName("ClusterConfigType")
    @Expose
    private Long ClusterConfigType;

    /**
    * eth0的ip地址
    */
    @SerializedName("IPAddress")
    @Expose
    private String IPAddress;

    /**
    * 计算组id
    */
    @SerializedName("ComputeGroupId")
    @Expose
    private String ComputeGroupId;

    /**
     * Get 集群实例ID 
     * @return InstanceId 集群实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例ID
     * @param InstanceId 集群实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get  0 公有云查询；1青鹅查询，青鹅查询显示所有需要展示的 
     * @return ConfigType  0 公有云查询；1青鹅查询，青鹅查询显示所有需要展示的
     */
    public Long getConfigType() {
        return this.ConfigType;
    }

    /**
     * Set  0 公有云查询；1青鹅查询，青鹅查询显示所有需要展示的
     * @param ConfigType  0 公有云查询；1青鹅查询，青鹅查询显示所有需要展示的
     */
    public void setConfigType(Long ConfigType) {
        this.ConfigType = ConfigType;
    }

    /**
     * Get 模糊搜索关键字文件 
     * @return FileName 模糊搜索关键字文件
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 模糊搜索关键字文件
     * @param FileName 模糊搜索关键字文件
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 0集群维度 1节点维度 2启动脚本 3计算组维度 
     * @return ClusterConfigType 0集群维度 1节点维度 2启动脚本 3计算组维度
     */
    public Long getClusterConfigType() {
        return this.ClusterConfigType;
    }

    /**
     * Set 0集群维度 1节点维度 2启动脚本 3计算组维度
     * @param ClusterConfigType 0集群维度 1节点维度 2启动脚本 3计算组维度
     */
    public void setClusterConfigType(Long ClusterConfigType) {
        this.ClusterConfigType = ClusterConfigType;
    }

    /**
     * Get eth0的ip地址 
     * @return IPAddress eth0的ip地址
     */
    public String getIPAddress() {
        return this.IPAddress;
    }

    /**
     * Set eth0的ip地址
     * @param IPAddress eth0的ip地址
     */
    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    /**
     * Get 计算组id 
     * @return ComputeGroupId 计算组id
     */
    public String getComputeGroupId() {
        return this.ComputeGroupId;
    }

    /**
     * Set 计算组id
     * @param ComputeGroupId 计算组id
     */
    public void setComputeGroupId(String ComputeGroupId) {
        this.ComputeGroupId = ComputeGroupId;
    }

    public DescribeClusterConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterConfigsRequest(DescribeClusterConfigsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConfigType != null) {
            this.ConfigType = new Long(source.ConfigType);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.ClusterConfigType != null) {
            this.ClusterConfigType = new Long(source.ClusterConfigType);
        }
        if (source.IPAddress != null) {
            this.IPAddress = new String(source.IPAddress);
        }
        if (source.ComputeGroupId != null) {
            this.ComputeGroupId = new String(source.ComputeGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ConfigType", this.ConfigType);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "ClusterConfigType", this.ClusterConfigType);
        this.setParamSimple(map, prefix + "IPAddress", this.IPAddress);
        this.setParamSimple(map, prefix + "ComputeGroupId", this.ComputeGroupId);

    }
}

