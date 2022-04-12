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
package com.tencentcloudapi.icr.v20211014.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RspMetadata extends AbstractModel{

    /**
    * 无
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 无
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 无
    */
    @SerializedName("SessionID")
    @Expose
    private String SessionID;

    /**
    * 无
    */
    @SerializedName("SessionDelta")
    @Expose
    private String SessionDelta;

    /**
     * Get 无 
     * @return Code 无
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 无
     * @param Code 无
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 无 
     * @return Message 无
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 无
     * @param Message 无
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 无 
     * @return SessionID 无
     */
    public String getSessionID() {
        return this.SessionID;
    }

    /**
     * Set 无
     * @param SessionID 无
     */
    public void setSessionID(String SessionID) {
        this.SessionID = SessionID;
    }

    /**
     * Get 无 
     * @return SessionDelta 无
     */
    public String getSessionDelta() {
        return this.SessionDelta;
    }

    /**
     * Set 无
     * @param SessionDelta 无
     */
    public void setSessionDelta(String SessionDelta) {
        this.SessionDelta = SessionDelta;
    }

    public RspMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RspMetadata(RspMetadata source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.SessionID != null) {
            this.SessionID = new String(source.SessionID);
        }
        if (source.SessionDelta != null) {
            this.SessionDelta = new String(source.SessionDelta);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "SessionID", this.SessionID);
        this.setParamSimple(map, prefix + "SessionDelta", this.SessionDelta);

    }
}

