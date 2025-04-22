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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtraInfo extends AbstractModel {

    /**
    * 是否开通VIP直通
    */
    @SerializedName("ZhiTong")
    @Expose
    private Boolean ZhiTong;

    /**
    * TgwGroup名称
    */
    @SerializedName("TgwGroupName")
    @Expose
    private String TgwGroupName;

    /**
     * Get 是否开通VIP直通 
     * @return ZhiTong 是否开通VIP直通
     */
    public Boolean getZhiTong() {
        return this.ZhiTong;
    }

    /**
     * Set 是否开通VIP直通
     * @param ZhiTong 是否开通VIP直通
     */
    public void setZhiTong(Boolean ZhiTong) {
        this.ZhiTong = ZhiTong;
    }

    /**
     * Get TgwGroup名称 
     * @return TgwGroupName TgwGroup名称
     */
    public String getTgwGroupName() {
        return this.TgwGroupName;
    }

    /**
     * Set TgwGroup名称
     * @param TgwGroupName TgwGroup名称
     */
    public void setTgwGroupName(String TgwGroupName) {
        this.TgwGroupName = TgwGroupName;
    }

    public ExtraInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtraInfo(ExtraInfo source) {
        if (source.ZhiTong != null) {
            this.ZhiTong = new Boolean(source.ZhiTong);
        }
        if (source.TgwGroupName != null) {
            this.TgwGroupName = new String(source.TgwGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZhiTong", this.ZhiTong);
        this.setParamSimple(map, prefix + "TgwGroupName", this.TgwGroupName);

    }
}

