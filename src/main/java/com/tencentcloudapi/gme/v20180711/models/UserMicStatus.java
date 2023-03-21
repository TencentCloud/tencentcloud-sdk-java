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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserMicStatus extends AbstractModel{

    /**
    * 开麦状态。1表示关闭麦克风，2表示打开麦克风。
    */
    @SerializedName("EnableMic")
    @Expose
    private Long EnableMic;

    /**
    * 客户端用于标识用户的Openid。（Uid、StrUid必须填一个，优先处理StrUid。）
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * 客户端用于标识字符串型用户的Openid。（Uid、StrUid必须填一个，优先处理StrUid。）
    */
    @SerializedName("StrUid")
    @Expose
    private String StrUid;

    /**
     * Get 开麦状态。1表示关闭麦克风，2表示打开麦克风。 
     * @return EnableMic 开麦状态。1表示关闭麦克风，2表示打开麦克风。
     */
    public Long getEnableMic() {
        return this.EnableMic;
    }

    /**
     * Set 开麦状态。1表示关闭麦克风，2表示打开麦克风。
     * @param EnableMic 开麦状态。1表示关闭麦克风，2表示打开麦克风。
     */
    public void setEnableMic(Long EnableMic) {
        this.EnableMic = EnableMic;
    }

    /**
     * Get 客户端用于标识用户的Openid。（Uid、StrUid必须填一个，优先处理StrUid。） 
     * @return Uid 客户端用于标识用户的Openid。（Uid、StrUid必须填一个，优先处理StrUid。）
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set 客户端用于标识用户的Openid。（Uid、StrUid必须填一个，优先处理StrUid。）
     * @param Uid 客户端用于标识用户的Openid。（Uid、StrUid必须填一个，优先处理StrUid。）
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 客户端用于标识字符串型用户的Openid。（Uid、StrUid必须填一个，优先处理StrUid。） 
     * @return StrUid 客户端用于标识字符串型用户的Openid。（Uid、StrUid必须填一个，优先处理StrUid。）
     */
    public String getStrUid() {
        return this.StrUid;
    }

    /**
     * Set 客户端用于标识字符串型用户的Openid。（Uid、StrUid必须填一个，优先处理StrUid。）
     * @param StrUid 客户端用于标识字符串型用户的Openid。（Uid、StrUid必须填一个，优先处理StrUid。）
     */
    public void setStrUid(String StrUid) {
        this.StrUid = StrUid;
    }

    public UserMicStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserMicStatus(UserMicStatus source) {
        if (source.EnableMic != null) {
            this.EnableMic = new Long(source.EnableMic);
        }
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.StrUid != null) {
            this.StrUid = new String(source.StrUid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableMic", this.EnableMic);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "StrUid", this.StrUid);

    }
}

