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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecLogJoinObjectsRequest extends AbstractModel {

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
    * 绑定列表
    */
    @SerializedName("BindList")
    @Expose
    private String [] BindList;

    /**
    * 待解绑列表，节点范围为全部时，含义为需剔除资产列表
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
    * 日志节点范围类型,0自选 1全部
    */
    @SerializedName("RangeType")
    @Expose
    private Long RangeType;

    /**
    * 新增资产是否自动加入，节点范围为全部时生效
    */
    @SerializedName("AutoJoin")
    @Expose
    private Boolean AutoJoin;

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
     * Get 绑定列表 
     * @return BindList 绑定列表
     */
    public String [] getBindList() {
        return this.BindList;
    }

    /**
     * Set 绑定列表
     * @param BindList 绑定列表
     */
    public void setBindList(String [] BindList) {
        this.BindList = BindList;
    }

    /**
     * Get 待解绑列表，节点范围为全部时，含义为需剔除资产列表 
     * @return UnBindList 待解绑列表，节点范围为全部时，含义为需剔除资产列表
     */
    public String [] getUnBindList() {
        return this.UnBindList;
    }

    /**
     * Set 待解绑列表，节点范围为全部时，含义为需剔除资产列表
     * @param UnBindList 待解绑列表，节点范围为全部时，含义为需剔除资产列表
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

    /**
     * Get 日志节点范围类型,0自选 1全部 
     * @return RangeType 日志节点范围类型,0自选 1全部
     */
    public Long getRangeType() {
        return this.RangeType;
    }

    /**
     * Set 日志节点范围类型,0自选 1全部
     * @param RangeType 日志节点范围类型,0自选 1全部
     */
    public void setRangeType(Long RangeType) {
        this.RangeType = RangeType;
    }

    /**
     * Get 新增资产是否自动加入，节点范围为全部时生效 
     * @return AutoJoin 新增资产是否自动加入，节点范围为全部时生效
     */
    public Boolean getAutoJoin() {
        return this.AutoJoin;
    }

    /**
     * Set 新增资产是否自动加入，节点范围为全部时生效
     * @param AutoJoin 新增资产是否自动加入，节点范围为全部时生效
     */
    public void setAutoJoin(Boolean AutoJoin) {
        this.AutoJoin = AutoJoin;
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
        if (source.RangeType != null) {
            this.RangeType = new Long(source.RangeType);
        }
        if (source.AutoJoin != null) {
            this.AutoJoin = new Boolean(source.AutoJoin);
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
        this.setParamSimple(map, prefix + "RangeType", this.RangeType);
        this.setParamSimple(map, prefix + "AutoJoin", this.AutoJoin);

    }
}

