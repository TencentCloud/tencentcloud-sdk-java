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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Equity extends AbstractModel {

    /**
    * <p>企业ID</p>
    */
    @SerializedName("EnterpriseUid")
    @Expose
    private String EnterpriseUid;

    /**
    * <p>名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>持股比例</p>
    */
    @SerializedName("ShareholdingRatio")
    @Expose
    private String ShareholdingRatio;

    /**
     * Get <p>企业ID</p> 
     * @return EnterpriseUid <p>企业ID</p>
     */
    public String getEnterpriseUid() {
        return this.EnterpriseUid;
    }

    /**
     * Set <p>企业ID</p>
     * @param EnterpriseUid <p>企业ID</p>
     */
    public void setEnterpriseUid(String EnterpriseUid) {
        this.EnterpriseUid = EnterpriseUid;
    }

    /**
     * Get <p>名称</p> 
     * @return Name <p>名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
     * @param Name <p>名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>持股比例</p> 
     * @return ShareholdingRatio <p>持股比例</p>
     */
    public String getShareholdingRatio() {
        return this.ShareholdingRatio;
    }

    /**
     * Set <p>持股比例</p>
     * @param ShareholdingRatio <p>持股比例</p>
     */
    public void setShareholdingRatio(String ShareholdingRatio) {
        this.ShareholdingRatio = ShareholdingRatio;
    }

    public Equity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Equity(Equity source) {
        if (source.EnterpriseUid != null) {
            this.EnterpriseUid = new String(source.EnterpriseUid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ShareholdingRatio != null) {
            this.ShareholdingRatio = new String(source.ShareholdingRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnterpriseUid", this.EnterpriseUid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ShareholdingRatio", this.ShareholdingRatio);

    }
}

