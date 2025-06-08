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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComputeResourceAdvanceParams extends AbstractModel {

    /**
    * 节点Label数组
    */
    @SerializedName("Labels")
    @Expose
    private TkeLabel [] Labels;

    /**
    * 节点污点
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * base64 编码的用户脚本，在初始化节点之前执行
    */
    @SerializedName("PreStartUserScript")
    @Expose
    private String PreStartUserScript;

    /**
    * base64 编码的用户脚本, 此脚本会在 k8s 组件运行后执行, 需要用户保证脚本的可重入及重试逻辑, 脚本及其生成的日志文件可在节点的 /data/ccs_userscript/ 路径查看
    */
    @SerializedName("UserScript")
    @Expose
    private String UserScript;

    /**
     * Get 节点Label数组 
     * @return Labels 节点Label数组
     */
    public TkeLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 节点Label数组
     * @param Labels 节点Label数组
     */
    public void setLabels(TkeLabel [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 节点污点 
     * @return Taints 节点污点
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set 节点污点
     * @param Taints 节点污点
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get base64 编码的用户脚本，在初始化节点之前执行 
     * @return PreStartUserScript base64 编码的用户脚本，在初始化节点之前执行
     */
    public String getPreStartUserScript() {
        return this.PreStartUserScript;
    }

    /**
     * Set base64 编码的用户脚本，在初始化节点之前执行
     * @param PreStartUserScript base64 编码的用户脚本，在初始化节点之前执行
     */
    public void setPreStartUserScript(String PreStartUserScript) {
        this.PreStartUserScript = PreStartUserScript;
    }

    /**
     * Get base64 编码的用户脚本, 此脚本会在 k8s 组件运行后执行, 需要用户保证脚本的可重入及重试逻辑, 脚本及其生成的日志文件可在节点的 /data/ccs_userscript/ 路径查看 
     * @return UserScript base64 编码的用户脚本, 此脚本会在 k8s 组件运行后执行, 需要用户保证脚本的可重入及重试逻辑, 脚本及其生成的日志文件可在节点的 /data/ccs_userscript/ 路径查看
     */
    public String getUserScript() {
        return this.UserScript;
    }

    /**
     * Set base64 编码的用户脚本, 此脚本会在 k8s 组件运行后执行, 需要用户保证脚本的可重入及重试逻辑, 脚本及其生成的日志文件可在节点的 /data/ccs_userscript/ 路径查看
     * @param UserScript base64 编码的用户脚本, 此脚本会在 k8s 组件运行后执行, 需要用户保证脚本的可重入及重试逻辑, 脚本及其生成的日志文件可在节点的 /data/ccs_userscript/ 路径查看
     */
    public void setUserScript(String UserScript) {
        this.UserScript = UserScript;
    }

    public ComputeResourceAdvanceParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComputeResourceAdvanceParams(ComputeResourceAdvanceParams source) {
        if (source.Labels != null) {
            this.Labels = new TkeLabel[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new TkeLabel(source.Labels[i]);
            }
        }
        if (source.Taints != null) {
            this.Taints = new Taint[source.Taints.length];
            for (int i = 0; i < source.Taints.length; i++) {
                this.Taints[i] = new Taint(source.Taints[i]);
            }
        }
        if (source.PreStartUserScript != null) {
            this.PreStartUserScript = new String(source.PreStartUserScript);
        }
        if (source.UserScript != null) {
            this.UserScript = new String(source.UserScript);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);
        this.setParamSimple(map, prefix + "PreStartUserScript", this.PreStartUserScript);
        this.setParamSimple(map, prefix + "UserScript", this.UserScript);

    }
}

