/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FailedAccount extends AbstractModel {

    /**
    * <p>下发失败的成员账号 UIN</p>
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * <p>下发失败的成员账号名</p>
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
     * Get <p>下发失败的成员账号 UIN</p> 
     * @return TargetUin <p>下发失败的成员账号 UIN</p>
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set <p>下发失败的成员账号 UIN</p>
     * @param TargetUin <p>下发失败的成员账号 UIN</p>
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    /**
     * Get <p>下发失败的成员账号名</p> 
     * @return TargetName <p>下发失败的成员账号名</p>
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set <p>下发失败的成员账号名</p>
     * @param TargetName <p>下发失败的成员账号名</p>
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    public FailedAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FailedAccount(FailedAccount source) {
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);

    }
}

