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
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * <p>pod name</p>
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * <p>命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>工作负载</p>
    */
    @SerializedName("Deployment")
    @Expose
    private String Deployment;

    /**
    * <p>pod ip</p>
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * <p>node ip</p>
    */
    @SerializedName("NodeIP")
    @Expose
    private String NodeIP;

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>集群ID</p> 
     * @return ClusterID <p>集群ID</p>
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterID <p>集群ID</p>
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get <p>pod name</p> 
     * @return PodName <p>pod name</p>
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set <p>pod name</p>
     * @param PodName <p>pod name</p>
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get <p>命名空间</p> 
     * @return Namespace <p>命名空间</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>命名空间</p>
     * @param Namespace <p>命名空间</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>工作负载</p> 
     * @return Deployment <p>工作负载</p>
     */
    public String getDeployment() {
        return this.Deployment;
    }

    /**
     * Set <p>工作负载</p>
     * @param Deployment <p>工作负载</p>
     */
    public void setDeployment(String Deployment) {
        this.Deployment = Deployment;
    }

    /**
     * Get <p>pod ip</p> 
     * @return PodIP <p>pod ip</p>
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set <p>pod ip</p>
     * @param PodIP <p>pod ip</p>
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get <p>node ip</p> 
     * @return NodeIP <p>node ip</p>
     */
    public String getNodeIP() {
        return this.NodeIP;
    }

    /**
     * Set <p>node ip</p>
     * @param NodeIP <p>node ip</p>
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

