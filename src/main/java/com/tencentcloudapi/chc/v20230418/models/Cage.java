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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Cage extends AbstractModel {

    /**
    * 围笼名称
    */
    @SerializedName("CageName")
    @Expose
    private String CageName;

    /**
    * 围笼审核人账号ID
    */
    @SerializedName("CheckerSet")
    @Expose
    private String [] CheckerSet;

    /**
     * Get 围笼名称 
     * @return CageName 围笼名称
     */
    public String getCageName() {
        return this.CageName;
    }

    /**
     * Set 围笼名称
     * @param CageName 围笼名称
     */
    public void setCageName(String CageName) {
        this.CageName = CageName;
    }

    /**
     * Get 围笼审核人账号ID 
     * @return CheckerSet 围笼审核人账号ID
     */
    public String [] getCheckerSet() {
        return this.CheckerSet;
    }

    /**
     * Set 围笼审核人账号ID
     * @param CheckerSet 围笼审核人账号ID
     */
    public void setCheckerSet(String [] CheckerSet) {
        this.CheckerSet = CheckerSet;
    }

    public Cage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Cage(Cage source) {
        if (source.CageName != null) {
            this.CageName = new String(source.CageName);
        }
        if (source.CheckerSet != null) {
            this.CheckerSet = new String[source.CheckerSet.length];
            for (int i = 0; i < source.CheckerSet.length; i++) {
                this.CheckerSet[i] = new String(source.CheckerSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CageName", this.CageName);
        this.setParamArraySimple(map, prefix + "CheckerSet.", this.CheckerSet);

    }
}

