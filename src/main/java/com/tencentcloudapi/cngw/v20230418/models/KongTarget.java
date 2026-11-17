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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KongTarget extends AbstractModel {

    /**
    * <p>目标主机地址</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>端口</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>权重</p>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>CVM实例ID</p>
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * <p>CVM实例名称</p>
    */
    @SerializedName("CvmInstanceName")
    @Expose
    private String CvmInstanceName;

    /**
    * <p>健康状态</p>
    */
    @SerializedName("Health")
    @Expose
    private String Health;

    /**
    * <p>Target ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>Target的来源</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>target标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get <p>目标主机地址</p> 
     * @return Host <p>目标主机地址</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>目标主机地址</p>
     * @param Host <p>目标主机地址</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>端口</p> 
     * @return Port <p>端口</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>端口</p>
     * @param Port <p>端口</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>权重</p> 
     * @return Weight <p>权重</p>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>权重</p>
     * @param Weight <p>权重</p>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedTime <p>创建时间</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedTime <p>创建时间</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>CVM实例ID</p> 
     * @return CvmInstanceId <p>CVM实例ID</p>
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * Set <p>CVM实例ID</p>
     * @param CvmInstanceId <p>CVM实例ID</p>
     */
    public void setCvmInstanceId(String CvmInstanceId) {
        this.CvmInstanceId = CvmInstanceId;
    }

    /**
     * Get <p>CVM实例名称</p> 
     * @return CvmInstanceName <p>CVM实例名称</p>
     */
    public String getCvmInstanceName() {
        return this.CvmInstanceName;
    }

    /**
     * Set <p>CVM实例名称</p>
     * @param CvmInstanceName <p>CVM实例名称</p>
     */
    public void setCvmInstanceName(String CvmInstanceName) {
        this.CvmInstanceName = CvmInstanceName;
    }

    /**
     * Get <p>健康状态</p> 
     * @return Health <p>健康状态</p>
     */
    public String getHealth() {
        return this.Health;
    }

    /**
     * Set <p>健康状态</p>
     * @param Health <p>健康状态</p>
     */
    public void setHealth(String Health) {
        this.Health = Health;
    }

    /**
     * Get <p>Target ID</p> 
     * @return Id <p>Target ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>Target ID</p>
     * @param Id <p>Target ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Target的来源</p> 
     * @return Source <p>Target的来源</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>Target的来源</p>
     * @param Source <p>Target的来源</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>target标签</p> 
     * @return Tags <p>target标签</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>target标签</p>
     * @param Tags <p>target标签</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    public KongTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongTarget(KongTarget source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.CvmInstanceId != null) {
            this.CvmInstanceId = new String(source.CvmInstanceId);
        }
        if (source.CvmInstanceName != null) {
            this.CvmInstanceName = new String(source.CvmInstanceName);
        }
        if (source.Health != null) {
            this.Health = new String(source.Health);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "CvmInstanceId", this.CvmInstanceId);
        this.setParamSimple(map, prefix + "CvmInstanceName", this.CvmInstanceName);
        this.setParamSimple(map, prefix + "Health", this.Health);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}

