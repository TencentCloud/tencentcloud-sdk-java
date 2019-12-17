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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetActionSequenceResponse extends AbstractModel{

    /**
    * 动作顺序(2,1 or 1,2) 。1代表张嘴，2代表闭眼。
    */
    @SerializedName("ActionSequence")
    @Expose
    private String ActionSequence;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 动作顺序(2,1 or 1,2) 。1代表张嘴，2代表闭眼。 
     * @return ActionSequence 动作顺序(2,1 or 1,2) 。1代表张嘴，2代表闭眼。
     */
    public String getActionSequence() {
        return this.ActionSequence;
    }

    /**
     * Set 动作顺序(2,1 or 1,2) 。1代表张嘴，2代表闭眼。
     * @param ActionSequence 动作顺序(2,1 or 1,2) 。1代表张嘴，2代表闭眼。
     */
    public void setActionSequence(String ActionSequence) {
        this.ActionSequence = ActionSequence;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionSequence", this.ActionSequence);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

