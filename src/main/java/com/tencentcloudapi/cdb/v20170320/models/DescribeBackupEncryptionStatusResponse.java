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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupEncryptionStatusResponse extends AbstractModel{

    /**
    * 实例是否开启了物理备份加密。可能的值有 on, off 。
    */
    @SerializedName("EncryptionStatus")
    @Expose
    private String EncryptionStatus;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例是否开启了物理备份加密。可能的值有 on, off 。 
     * @return EncryptionStatus 实例是否开启了物理备份加密。可能的值有 on, off 。
     */
    public String getEncryptionStatus() {
        return this.EncryptionStatus;
    }

    /**
     * Set 实例是否开启了物理备份加密。可能的值有 on, off 。
     * @param EncryptionStatus 实例是否开启了物理备份加密。可能的值有 on, off 。
     */
    public void setEncryptionStatus(String EncryptionStatus) {
        this.EncryptionStatus = EncryptionStatus;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBackupEncryptionStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupEncryptionStatusResponse(DescribeBackupEncryptionStatusResponse source) {
        if (source.EncryptionStatus != null) {
            this.EncryptionStatus = new String(source.EncryptionStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EncryptionStatus", this.EncryptionStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

