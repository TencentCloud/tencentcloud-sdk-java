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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KongTarget extends AbstractModel{

    /**
    * Host
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 权重
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 健康状态
    */
    @SerializedName("Health")
    @Expose
    private String Health;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Target的来源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
     * Get Host 
     * @return Host Host
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host
     * @param Host Host
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 权重 
     * @return Weight 权重
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重
     * @param Weight 权重
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 健康状态 
     * @return Health 健康状态
     */
    public String getHealth() {
        return this.Health;
    }

    /**
     * Set 健康状态
     * @param Health 健康状态
     */
    public void setHealth(String Health) {
        this.Health = Health;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Target的来源 
     * @return Source Target的来源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Target的来源
     * @param Source Target的来源
     */
    public void setSource(String Source) {
        this.Source = Source;
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
        if (source.Health != null) {
            this.Health = new String(source.Health);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Health", this.Health);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

