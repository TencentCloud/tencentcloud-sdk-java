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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BillAreaInfo extends AbstractModel {

    /**
    * 大区名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 国家或地区明细数据。
    */
    @SerializedName("Countrys")
    @Expose
    private BillCountryInfo [] Countrys;

    /**
     * Get 大区名称。 
     * @return Name 大区名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 大区名称。
     * @param Name 大区名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 国家或地区明细数据。 
     * @return Countrys 国家或地区明细数据。
     */
    public BillCountryInfo [] getCountrys() {
        return this.Countrys;
    }

    /**
     * Set 国家或地区明细数据。
     * @param Countrys 国家或地区明细数据。
     */
    public void setCountrys(BillCountryInfo [] Countrys) {
        this.Countrys = Countrys;
    }

    public BillAreaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillAreaInfo(BillAreaInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Countrys != null) {
            this.Countrys = new BillCountryInfo[source.Countrys.length];
            for (int i = 0; i < source.Countrys.length; i++) {
                this.Countrys[i] = new BillCountryInfo(source.Countrys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Countrys.", this.Countrys);

    }
}

