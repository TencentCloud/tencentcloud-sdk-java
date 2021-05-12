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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WhiteboardPushBackupParam extends AbstractModel{

    /**
    * 用于白板推流服务进房的用户ID，
该ID必须是一个单独的未在SDK中使用的ID，白板推流服务将使用这个用户ID进入房间进行白板推流，若该ID和SDK中使用的ID重复，会导致SDK和录制服务互踢，影响正常推流。
    */
    @SerializedName("PushUserId")
    @Expose
    private String PushUserId;

    /**
    * 与PushUserId对应的签名
    */
    @SerializedName("PushUserSig")
    @Expose
    private String PushUserSig;

    /**
     * Get 用于白板推流服务进房的用户ID，
该ID必须是一个单独的未在SDK中使用的ID，白板推流服务将使用这个用户ID进入房间进行白板推流，若该ID和SDK中使用的ID重复，会导致SDK和录制服务互踢，影响正常推流。 
     * @return PushUserId 用于白板推流服务进房的用户ID，
该ID必须是一个单独的未在SDK中使用的ID，白板推流服务将使用这个用户ID进入房间进行白板推流，若该ID和SDK中使用的ID重复，会导致SDK和录制服务互踢，影响正常推流。
     */
    public String getPushUserId() {
        return this.PushUserId;
    }

    /**
     * Set 用于白板推流服务进房的用户ID，
该ID必须是一个单独的未在SDK中使用的ID，白板推流服务将使用这个用户ID进入房间进行白板推流，若该ID和SDK中使用的ID重复，会导致SDK和录制服务互踢，影响正常推流。
     * @param PushUserId 用于白板推流服务进房的用户ID，
该ID必须是一个单独的未在SDK中使用的ID，白板推流服务将使用这个用户ID进入房间进行白板推流，若该ID和SDK中使用的ID重复，会导致SDK和录制服务互踢，影响正常推流。
     */
    public void setPushUserId(String PushUserId) {
        this.PushUserId = PushUserId;
    }

    /**
     * Get 与PushUserId对应的签名 
     * @return PushUserSig 与PushUserId对应的签名
     */
    public String getPushUserSig() {
        return this.PushUserSig;
    }

    /**
     * Set 与PushUserId对应的签名
     * @param PushUserSig 与PushUserId对应的签名
     */
    public void setPushUserSig(String PushUserSig) {
        this.PushUserSig = PushUserSig;
    }

    public WhiteboardPushBackupParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WhiteboardPushBackupParam(WhiteboardPushBackupParam source) {
        if (source.PushUserId != null) {
            this.PushUserId = new String(source.PushUserId);
        }
        if (source.PushUserSig != null) {
            this.PushUserSig = new String(source.PushUserSig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PushUserId", this.PushUserId);
        this.setParamSimple(map, prefix + "PushUserSig", this.PushUserSig);

    }
}

