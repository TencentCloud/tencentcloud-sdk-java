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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageCommonGjh extends AbstractModel{

    /**
    * 密码（由腾讯提供）
    */
    @SerializedName("StrPassword")
    @Expose
    private String StrPassword;

    /**
    * 账号（由腾讯提供）
    */
    @SerializedName("UiAppID")
    @Expose
    private Long UiAppID;

    /**
    * 业务场景ID: 1：媒体类；2：流媒体类；3：即时通讯类；4：社交日志；5：评论类；6：资料类；7：文件类；8：互动类；9：论坛类
    */
    @SerializedName("UiAppSceneID")
    @Expose
    private Long UiAppSceneID;

    /**
    * 请求序列号，会原样回到给业务侧请求序列号，会原样回到给业务侧，用于上游异步处理
    */
    @SerializedName("UiSeq")
    @Expose
    private Long UiSeq;

    /**
     * Get 密码（由腾讯提供） 
     * @return StrPassword 密码（由腾讯提供）
     */
    public String getStrPassword() {
        return this.StrPassword;
    }

    /**
     * Set 密码（由腾讯提供）
     * @param StrPassword 密码（由腾讯提供）
     */
    public void setStrPassword(String StrPassword) {
        this.StrPassword = StrPassword;
    }

    /**
     * Get 账号（由腾讯提供） 
     * @return UiAppID 账号（由腾讯提供）
     */
    public Long getUiAppID() {
        return this.UiAppID;
    }

    /**
     * Set 账号（由腾讯提供）
     * @param UiAppID 账号（由腾讯提供）
     */
    public void setUiAppID(Long UiAppID) {
        this.UiAppID = UiAppID;
    }

    /**
     * Get 业务场景ID: 1：媒体类；2：流媒体类；3：即时通讯类；4：社交日志；5：评论类；6：资料类；7：文件类；8：互动类；9：论坛类 
     * @return UiAppSceneID 业务场景ID: 1：媒体类；2：流媒体类；3：即时通讯类；4：社交日志；5：评论类；6：资料类；7：文件类；8：互动类；9：论坛类
     */
    public Long getUiAppSceneID() {
        return this.UiAppSceneID;
    }

    /**
     * Set 业务场景ID: 1：媒体类；2：流媒体类；3：即时通讯类；4：社交日志；5：评论类；6：资料类；7：文件类；8：互动类；9：论坛类
     * @param UiAppSceneID 业务场景ID: 1：媒体类；2：流媒体类；3：即时通讯类；4：社交日志；5：评论类；6：资料类；7：文件类；8：互动类；9：论坛类
     */
    public void setUiAppSceneID(Long UiAppSceneID) {
        this.UiAppSceneID = UiAppSceneID;
    }

    /**
     * Get 请求序列号，会原样回到给业务侧请求序列号，会原样回到给业务侧，用于上游异步处理 
     * @return UiSeq 请求序列号，会原样回到给业务侧请求序列号，会原样回到给业务侧，用于上游异步处理
     */
    public Long getUiSeq() {
        return this.UiSeq;
    }

    /**
     * Set 请求序列号，会原样回到给业务侧请求序列号，会原样回到给业务侧，用于上游异步处理
     * @param UiSeq 请求序列号，会原样回到给业务侧请求序列号，会原样回到给业务侧，用于上游异步处理
     */
    public void setUiSeq(Long UiSeq) {
        this.UiSeq = UiSeq;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrPassword", this.StrPassword);
        this.setParamSimple(map, prefix + "UiAppID", this.UiAppID);
        this.setParamSimple(map, prefix + "UiAppSceneID", this.UiAppSceneID);
        this.setParamSimple(map, prefix + "UiSeq", this.UiSeq);

    }
}

