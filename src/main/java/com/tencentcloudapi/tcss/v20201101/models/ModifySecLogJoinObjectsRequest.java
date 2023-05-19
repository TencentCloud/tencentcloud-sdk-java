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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecLogJoinObjectsRequest extends AbstractModel{

    /**
    * 日志类型
bash日志: container_bash
容器启动: container_launch
k8sApi: k8s_api
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 绑定主机quuid列表
    */
    @SerializedName("BindList")
    @Expose
    private String [] BindList;

    /**
    * 待解绑主机quuid列表
    */
    @SerializedName("UnBindList")
    @Expose
    private String [] UnBindList;

    /**
    * 节点类型:
NORMAL: 普通节点(默认值)
SUPER: 超级节点

    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
     * Get 日志类型
bash日志: container_bash
容器启动: container_launch
k8sApi: k8s_api 
     * @return LogType 日志类型
bash日志: container_bash
容器启动: container_launch
k8sApi: k8s_api
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型
bash日志: container_bash
容器启动: container_launch
k8sApi: k8s_api
     * @param LogType 日志类型
bash日志: container_bash
容器启动: container_launch
k8sApi: k8s_api
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 绑定主机quuid列表 
     * @return BindList 绑定主机quuid列表
     */
    public String [] getBindList() {
        return this.BindList;
    }

    /**
     * Set 绑定主机quuid列表
     * @param BindList 绑定主机quuid列表
     */
    public void setBindList(String [] BindList) {
        this.BindList = BindList;
    }

    /**
     * Get 待解绑主机quuid列表 
     * @return UnBindList 待解绑主机quuid列表
     */
    public String [] getUnBindList() {
        return this.UnBindList;
    }

    /**
     * Set 待解绑主机quuid列表
     * @param UnBindList 待解绑主机quuid列表
     */
    public void setUnBindList(String [] UnBindList) {
        this.UnBindList = UnBindList;
    }

    /**
     * Get 节点类型:
NORMAL: 普通节点(默认值)
SUPER: 超级节点
 
     * @return NodeType 节点类型:
NORMAL: 普通节点(默认值)
SUPER: 超级节点

     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型:
NORMAL: 普通节点(默认值)
SUPER: 超级节点

     * @param NodeType 节点类型:
NORMAL: 普通节点(默认值)
SUPER: 超级节点

     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    public ModifySecLogJoinObjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecLogJoinObjectsRequest(ModifySecLogJoinObjectsRequest source) {
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.BindList != null) {
            this.BindList = new String[source.BindList.length];
            for (int i = 0; i < source.BindList.length; i++) {
                this.BindList[i] = new String(source.BindList[i]);
            }
        }
        if (source.UnBindList != null) {
            this.UnBindList = new String[source.UnBindList.length];
            for (int i = 0; i < source.UnBindList.length; i++) {
                this.UnBindList[i] = new String(source.UnBindList[i]);
            }
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamArraySimple(map, prefix + "BindList.", this.BindList);
        this.setParamArraySimple(map, prefix + "UnBindList.", this.UnBindList);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);

    }
}

