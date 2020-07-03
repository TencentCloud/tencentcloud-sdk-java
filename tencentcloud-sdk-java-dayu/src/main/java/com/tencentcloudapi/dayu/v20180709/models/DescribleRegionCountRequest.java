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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribleRegionCountRequest extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 根据线路统计，取值为[1（BGP线路），2（南京电信），3（南京联通），99（第三方合作线路）]；只对高防IP产品有效，其他产品此字段忽略
    */
    @SerializedName("LineList")
    @Expose
    private Long [] LineList;

    /**
     * Get 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；） 
     * @return Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；）
     * @param Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 根据线路统计，取值为[1（BGP线路），2（南京电信），3（南京联通），99（第三方合作线路）]；只对高防IP产品有效，其他产品此字段忽略 
     * @return LineList 根据线路统计，取值为[1（BGP线路），2（南京电信），3（南京联通），99（第三方合作线路）]；只对高防IP产品有效，其他产品此字段忽略
     */
    public Long [] getLineList() {
        return this.LineList;
    }

    /**
     * Set 根据线路统计，取值为[1（BGP线路），2（南京电信），3（南京联通），99（第三方合作线路）]；只对高防IP产品有效，其他产品此字段忽略
     * @param LineList 根据线路统计，取值为[1（BGP线路），2（南京电信），3（南京联通），99（第三方合作线路）]；只对高防IP产品有效，其他产品此字段忽略
     */
    public void setLineList(Long [] LineList) {
        this.LineList = LineList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamArraySimple(map, prefix + "LineList.", this.LineList);

    }
}

