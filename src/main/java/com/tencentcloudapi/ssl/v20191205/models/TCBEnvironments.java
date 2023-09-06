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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TCBEnvironments extends AbstractModel{

    /**
    * tcb环境	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Environment")
    @Expose
    private TCBEnvironment Environment;

    /**
    * 访问服务	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessService")
    @Expose
    private TCBAccessService AccessService;

    /**
    * 静态托管	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostService")
    @Expose
    private TCBHostService HostService;

    /**
     * Get tcb环境	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Environment tcb环境	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TCBEnvironment getEnvironment() {
        return this.Environment;
    }

    /**
     * Set tcb环境	
注意：此字段可能返回 null，表示取不到有效值。
     * @param Environment tcb环境	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironment(TCBEnvironment Environment) {
        this.Environment = Environment;
    }

    /**
     * Get 访问服务	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessService 访问服务	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TCBAccessService getAccessService() {
        return this.AccessService;
    }

    /**
     * Set 访问服务	
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessService 访问服务	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessService(TCBAccessService AccessService) {
        this.AccessService = AccessService;
    }

    /**
     * Get 静态托管	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostService 静态托管	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TCBHostService getHostService() {
        return this.HostService;
    }

    /**
     * Set 静态托管	
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostService 静态托管	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostService(TCBHostService HostService) {
        this.HostService = HostService;
    }

    public TCBEnvironments() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TCBEnvironments(TCBEnvironments source) {
        if (source.Environment != null) {
            this.Environment = new TCBEnvironment(source.Environment);
        }
        if (source.AccessService != null) {
            this.AccessService = new TCBAccessService(source.AccessService);
        }
        if (source.HostService != null) {
            this.HostService = new TCBHostService(source.HostService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Environment.", this.Environment);
        this.setParamObj(map, prefix + "AccessService.", this.AccessService);
        this.setParamObj(map, prefix + "HostService.", this.HostService);

    }
}

