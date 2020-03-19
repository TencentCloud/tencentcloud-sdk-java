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
package com.tencentcloudapi.mvj.v20190926.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Data extends AbstractModel{

    /**
    * 操作时间戳，单位秒
    */
    @SerializedName("PostTime")
    @Expose
    private Long PostTime;

    /**
    * 用户ID 
accountType不同对应不同的用户ID。如果是QQ或微信用户则填入对应的openId
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 操作来源的外网IP
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 0~100：营销价值评分，分值越高，价值越大
[0,50]低价值
[50,70]价值一般
[70,100]高价值
    */
    @SerializedName("ValueScore")
    @Expose
    private Long ValueScore;

    /**
     * Get 操作时间戳，单位秒 
     * @return PostTime 操作时间戳，单位秒
     */
    public Long getPostTime() {
        return this.PostTime;
    }

    /**
     * Set 操作时间戳，单位秒
     * @param PostTime 操作时间戳，单位秒
     */
    public void setPostTime(Long PostTime) {
        this.PostTime = PostTime;
    }

    /**
     * Get 用户ID 
accountType不同对应不同的用户ID。如果是QQ或微信用户则填入对应的openId 
     * @return Uid 用户ID 
accountType不同对应不同的用户ID。如果是QQ或微信用户则填入对应的openId
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 用户ID 
accountType不同对应不同的用户ID。如果是QQ或微信用户则填入对应的openId
     * @param Uid 用户ID 
accountType不同对应不同的用户ID。如果是QQ或微信用户则填入对应的openId
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 操作来源的外网IP 
     * @return UserIp 操作来源的外网IP
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 操作来源的外网IP
     * @param UserIp 操作来源的外网IP
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 0~100：营销价值评分，分值越高，价值越大
[0,50]低价值
[50,70]价值一般
[70,100]高价值 
     * @return ValueScore 0~100：营销价值评分，分值越高，价值越大
[0,50]低价值
[50,70]价值一般
[70,100]高价值
     */
    public Long getValueScore() {
        return this.ValueScore;
    }

    /**
     * Set 0~100：营销价值评分，分值越高，价值越大
[0,50]低价值
[50,70]价值一般
[70,100]高价值
     * @param ValueScore 0~100：营销价值评分，分值越高，价值越大
[0,50]低价值
[50,70]价值一般
[70,100]高价值
     */
    public void setValueScore(Long ValueScore) {
        this.ValueScore = ValueScore;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PostTime", this.PostTime);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "ValueScore", this.ValueScore);

    }
}

