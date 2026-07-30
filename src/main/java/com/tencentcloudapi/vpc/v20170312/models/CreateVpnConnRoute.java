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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVpnConnRoute extends AbstractModel {

    /**
    * <p>目的端IDC网段</p>
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * <p>优先级；可选值0，100。</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>路由备注；可选值</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>目的端IDC网段</p> 
     * @return DestinationCidrBlock <p>目的端IDC网段</p>
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set <p>目的端IDC网段</p>
     * @param DestinationCidrBlock <p>目的端IDC网段</p>
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get <p>优先级；可选值0，100。</p> 
     * @return Priority <p>优先级；可选值0，100。</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>优先级；可选值0，100。</p>
     * @param Priority <p>优先级；可选值0，100。</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>路由备注；可选值</p> 
     * @return Description <p>路由备注；可选值</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>路由备注；可选值</p>
     * @param Description <p>路由备注；可选值</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateVpnConnRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVpnConnRoute(CreateVpnConnRoute source) {
        if (source.DestinationCidrBlock != null) {
            this.DestinationCidrBlock = new String(source.DestinationCidrBlock);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

