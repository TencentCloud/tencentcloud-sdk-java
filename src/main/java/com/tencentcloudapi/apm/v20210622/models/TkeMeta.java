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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TkeMeta extends AbstractModel {

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 集群ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * pod name
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 工作负载
    */
    @SerializedName("Deployment")
    @Expose
    private String Deployment;

    /**
    * pod ip
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * node ip
    */
    @SerializedName("NodeIP")
    @Expose
    private String NodeIP;

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 集群ID 
     * @return ClusterID 集群ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 集群ID
     * @param ClusterID 集群ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get pod name 
     * @return PodName pod name
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set pod name
     * @param PodName pod name
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 工作负载 
     * @return Deployment 工作负载
     */
    public String getDeployment() {
        return this.Deployment;
    }

    /**
     * Set 工作负载
     * @param Deployment 工作负载
     */
    public void setDeployment(String Deployment) {
        this.Deployment = Deployment;
    }

    /**
     * Get pod ip 
     * @return PodIP pod ip
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set pod ip
     * @param PodIP pod ip
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get node ip 
     * @return NodeIP node ip
     */
    public String getNodeIP() {
        return this.NodeIP;
    }

    /**
     * Set node ip
     * @param NodeIP node ip
     */
    public void setNodeIP(String NodeIP) {
        this.NodeIP = NodeIP;
    }

    public TkeMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TkeMeta(TkeMeta source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Deployment != null) {
            this.Deployment = new String(source.Deployment);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.NodeIP != null) {
            this.NodeIP = new String(source.NodeIP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Deployment", this.Deployment);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "NodeIP", this.NodeIP);

    }
}

