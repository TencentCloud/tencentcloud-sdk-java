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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EsAcl extends AbstractModel{

    /**
    * kibana访问黑名单
    */
    @SerializedName("BlackIpList")
    @Expose
    private String [] BlackIpList;

    /**
    * kibana访问白名单
    */
    @SerializedName("WhiteIpList")
    @Expose
    private String [] WhiteIpList;

    /**
     * Get kibana访问黑名单 
     * @return BlackIpList kibana访问黑名单
     */
    public String [] getBlackIpList() {
        return this.BlackIpList;
    }

    /**
     * Set kibana访问黑名单
     * @param BlackIpList kibana访问黑名单
     */
    public void setBlackIpList(String [] BlackIpList) {
        this.BlackIpList = BlackIpList;
    }

    /**
     * Get kibana访问白名单 
     * @return WhiteIpList kibana访问白名单
     */
    public String [] getWhiteIpList() {
        return this.WhiteIpList;
    }

    /**
     * Set kibana访问白名单
     * @param WhiteIpList kibana访问白名单
     */
    public void setWhiteIpList(String [] WhiteIpList) {
        this.WhiteIpList = WhiteIpList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BlackIpList.", this.BlackIpList);
        this.setParamArraySimple(map, prefix + "WhiteIpList.", this.WhiteIpList);

    }
}

