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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetMsgRecordRequest extends AbstractModel {

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 数量,  数量需大于2
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 会话sessionid
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 最后一条记录ID
    */
    @SerializedName("LastRecordId")
    @Expose
    private String LastRecordId;

    /**
    * 应用AppKey, 当Type=5[API访客]时, 该字段必填  :</br>  获取方式:</br>   1、应用发布后在应用页面[发布管理]-[调用信息]-[API管理]处获取</br>   2、参考 https://cloud.tencent.com/document/product/1759/109469 第二项
    */
    @SerializedName("BotAppKey")
    @Expose
    private String BotAppKey;

    /**
    * 场景, 体验: 1; 正式: 2
    */
    @SerializedName("Scene")
    @Expose
    private Long Scene;

    /**
    * 传该值，代表拉取该记录id的前后总共count条消息记录
    */
    @SerializedName("MidRecordId")
    @Expose
    private String MidRecordId;

    /**
     * Get 类型 
     * @return Type 类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 数量,  数量需大于2 
     * @return Count 数量,  数量需大于2
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 数量,  数量需大于2
     * @param Count 数量,  数量需大于2
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 会话sessionid 
     * @return SessionId 会话sessionid
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话sessionid
     * @param SessionId 会话sessionid
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 最后一条记录ID 
     * @return LastRecordId 最后一条记录ID
     */
    public String getLastRecordId() {
        return this.LastRecordId;
    }

    /**
     * Set 最后一条记录ID
     * @param LastRecordId 最后一条记录ID
     */
    public void setLastRecordId(String LastRecordId) {
        this.LastRecordId = LastRecordId;
    }

    /**
     * Get 应用AppKey, 当Type=5[API访客]时, 该字段必填  :</br>  获取方式:</br>   1、应用发布后在应用页面[发布管理]-[调用信息]-[API管理]处获取</br>   2、参考 https://cloud.tencent.com/document/product/1759/109469 第二项 
     * @return BotAppKey 应用AppKey, 当Type=5[API访客]时, 该字段必填  :</br>  获取方式:</br>   1、应用发布后在应用页面[发布管理]-[调用信息]-[API管理]处获取</br>   2、参考 https://cloud.tencent.com/document/product/1759/109469 第二项
     */
    public String getBotAppKey() {
        return this.BotAppKey;
    }

    /**
     * Set 应用AppKey, 当Type=5[API访客]时, 该字段必填  :</br>  获取方式:</br>   1、应用发布后在应用页面[发布管理]-[调用信息]-[API管理]处获取</br>   2、参考 https://cloud.tencent.com/document/product/1759/109469 第二项
     * @param BotAppKey 应用AppKey, 当Type=5[API访客]时, 该字段必填  :</br>  获取方式:</br>   1、应用发布后在应用页面[发布管理]-[调用信息]-[API管理]处获取</br>   2、参考 https://cloud.tencent.com/document/product/1759/109469 第二项
     */
    public void setBotAppKey(String BotAppKey) {
        this.BotAppKey = BotAppKey;
    }

    /**
     * Get 场景, 体验: 1; 正式: 2 
     * @return Scene 场景, 体验: 1; 正式: 2
     */
    public Long getScene() {
        return this.Scene;
    }

    /**
     * Set 场景, 体验: 1; 正式: 2
     * @param Scene 场景, 体验: 1; 正式: 2
     */
    public void setScene(Long Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 传该值，代表拉取该记录id的前后总共count条消息记录 
     * @return MidRecordId 传该值，代表拉取该记录id的前后总共count条消息记录
     */
    public String getMidRecordId() {
        return this.MidRecordId;
    }

    /**
     * Set 传该值，代表拉取该记录id的前后总共count条消息记录
     * @param MidRecordId 传该值，代表拉取该记录id的前后总共count条消息记录
     */
    public void setMidRecordId(String MidRecordId) {
        this.MidRecordId = MidRecordId;
    }

    public GetMsgRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetMsgRecordRequest(GetMsgRecordRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.LastRecordId != null) {
            this.LastRecordId = new String(source.LastRecordId);
        }
        if (source.BotAppKey != null) {
            this.BotAppKey = new String(source.BotAppKey);
        }
        if (source.Scene != null) {
            this.Scene = new Long(source.Scene);
        }
        if (source.MidRecordId != null) {
            this.MidRecordId = new String(source.MidRecordId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "LastRecordId", this.LastRecordId);
        this.setParamSimple(map, prefix + "BotAppKey", this.BotAppKey);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "MidRecordId", this.MidRecordId);

    }
}

