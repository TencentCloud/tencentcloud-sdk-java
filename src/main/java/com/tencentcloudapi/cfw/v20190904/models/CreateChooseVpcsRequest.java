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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateChooseVpcsRequest extends AbstractModel{

    /**
    * vpc列表
    */
    @SerializedName("VpcList")
    @Expose
    private String [] VpcList;

    /**
    * zone列表
    */
    @SerializedName("AllZoneList")
    @Expose
    private VpcZoneData [] AllZoneList;

    /**
     * Get vpc列表 
     * @return VpcList vpc列表
     */
    public String [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set vpc列表
     * @param VpcList vpc列表
     */
    public void setVpcList(String [] VpcList) {
        this.VpcList = VpcList;
    }

    /**
     * Get zone列表 
     * @return AllZoneList zone列表
     */
    public VpcZoneData [] getAllZoneList() {
        return this.AllZoneList;
    }

    /**
     * Set zone列表
     * @param AllZoneList zone列表
     */
    public void setAllZoneList(VpcZoneData [] AllZoneList) {
        this.AllZoneList = AllZoneList;
    }

    public CreateChooseVpcsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateChooseVpcsRequest(CreateChooseVpcsRequest source) {
        if (source.VpcList != null) {
            this.VpcList = new String[source.VpcList.length];
            for (int i = 0; i < source.VpcList.length; i++) {
                this.VpcList[i] = new String(source.VpcList[i]);
            }
        }
        if (source.AllZoneList != null) {
            this.AllZoneList = new VpcZoneData[source.AllZoneList.length];
            for (int i = 0; i < source.AllZoneList.length; i++) {
                this.AllZoneList[i] = new VpcZoneData(source.AllZoneList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VpcList.", this.VpcList);
        this.setParamArrayObj(map, prefix + "AllZoneList.", this.AllZoneList);

    }
}

