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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMasterComponentRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * master组件名称，支持kube-apiserver、kube-scheduler、kube-controller-manager
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * 停机或恢复，值只能为：shutdown或restore
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 为true时，不真正执行停机或恢复操作	
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get master组件名称，支持kube-apiserver、kube-scheduler、kube-controller-manager 
     * @return Component master组件名称，支持kube-apiserver、kube-scheduler、kube-controller-manager
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set master组件名称，支持kube-apiserver、kube-scheduler、kube-controller-manager
     * @param Component master组件名称，支持kube-apiserver、kube-scheduler、kube-controller-manager
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get 停机或恢复，值只能为：shutdown或restore 
     * @return Operation 停机或恢复，值只能为：shutdown或restore
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 停机或恢复，值只能为：shutdown或restore
     * @param Operation 停机或恢复，值只能为：shutdown或restore
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 为true时，不真正执行停机或恢复操作	 
     * @return DryRun 为true时，不真正执行停机或恢复操作	
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 为true时，不真正执行停机或恢复操作	
     * @param DryRun 为true时，不真正执行停机或恢复操作	
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public ModifyMasterComponentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMasterComponentRequest(ModifyMasterComponentRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

