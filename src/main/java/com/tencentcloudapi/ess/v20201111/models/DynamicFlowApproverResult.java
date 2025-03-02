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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DynamicFlowApproverResult extends AbstractModel {

    /**
    * 签署方角色编号，签署方角色编号是用于区分同一个流程中不同签署方的唯一标识。不同的流程会出现同样的签署方角色编号。

填写控件和签署控件都与特定的角色编号关联。

在进行新增签署方操作时，建议记录下该签署方的角色编号。后续可以拉取流程信息，用来判断该签署方的当前状态。

    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 签署方唯一编号，一个全局唯一的标识符，不同的流程不会出现冲突。

可以使用签署方的唯一编号来生成签署链接（也可以通过RecipientId来生成签署链接）。
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

    /**
    * 签署方当前状态，会出现下面的状态

2：待签署
3：已签署
4：已拒绝
5：已过期
6：已撤销
8：待填写
9：因为各种原因（签署人改名等）而终止
10：填写完成
15：已解除
19：转他人处理
    */
    @SerializedName("ApproverStatus")
    @Expose
    private Long ApproverStatus;

    /**
     * Get 签署方角色编号，签署方角色编号是用于区分同一个流程中不同签署方的唯一标识。不同的流程会出现同样的签署方角色编号。

填写控件和签署控件都与特定的角色编号关联。

在进行新增签署方操作时，建议记录下该签署方的角色编号。后续可以拉取流程信息，用来判断该签署方的当前状态。
 
     * @return RecipientId 签署方角色编号，签署方角色编号是用于区分同一个流程中不同签署方的唯一标识。不同的流程会出现同样的签署方角色编号。

填写控件和签署控件都与特定的角色编号关联。

在进行新增签署方操作时，建议记录下该签署方的角色编号。后续可以拉取流程信息，用来判断该签署方的当前状态。

     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 签署方角色编号，签署方角色编号是用于区分同一个流程中不同签署方的唯一标识。不同的流程会出现同样的签署方角色编号。

填写控件和签署控件都与特定的角色编号关联。

在进行新增签署方操作时，建议记录下该签署方的角色编号。后续可以拉取流程信息，用来判断该签署方的当前状态。

     * @param RecipientId 签署方角色编号，签署方角色编号是用于区分同一个流程中不同签署方的唯一标识。不同的流程会出现同样的签署方角色编号。

填写控件和签署控件都与特定的角色编号关联。

在进行新增签署方操作时，建议记录下该签署方的角色编号。后续可以拉取流程信息，用来判断该签署方的当前状态。

     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 签署方唯一编号，一个全局唯一的标识符，不同的流程不会出现冲突。

可以使用签署方的唯一编号来生成签署链接（也可以通过RecipientId来生成签署链接）。 
     * @return SignId 签署方唯一编号，一个全局唯一的标识符，不同的流程不会出现冲突。

可以使用签署方的唯一编号来生成签署链接（也可以通过RecipientId来生成签署链接）。
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set 签署方唯一编号，一个全局唯一的标识符，不同的流程不会出现冲突。

可以使用签署方的唯一编号来生成签署链接（也可以通过RecipientId来生成签署链接）。
     * @param SignId 签署方唯一编号，一个全局唯一的标识符，不同的流程不会出现冲突。

可以使用签署方的唯一编号来生成签署链接（也可以通过RecipientId来生成签署链接）。
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
    }

    /**
     * Get 签署方当前状态，会出现下面的状态

2：待签署
3：已签署
4：已拒绝
5：已过期
6：已撤销
8：待填写
9：因为各种原因（签署人改名等）而终止
10：填写完成
15：已解除
19：转他人处理 
     * @return ApproverStatus 签署方当前状态，会出现下面的状态

2：待签署
3：已签署
4：已拒绝
5：已过期
6：已撤销
8：待填写
9：因为各种原因（签署人改名等）而终止
10：填写完成
15：已解除
19：转他人处理
     */
    public Long getApproverStatus() {
        return this.ApproverStatus;
    }

    /**
     * Set 签署方当前状态，会出现下面的状态

2：待签署
3：已签署
4：已拒绝
5：已过期
6：已撤销
8：待填写
9：因为各种原因（签署人改名等）而终止
10：填写完成
15：已解除
19：转他人处理
     * @param ApproverStatus 签署方当前状态，会出现下面的状态

2：待签署
3：已签署
4：已拒绝
5：已过期
6：已撤销
8：待填写
9：因为各种原因（签署人改名等）而终止
10：填写完成
15：已解除
19：转他人处理
     */
    public void setApproverStatus(Long ApproverStatus) {
        this.ApproverStatus = ApproverStatus;
    }

    public DynamicFlowApproverResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicFlowApproverResult(DynamicFlowApproverResult source) {
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
        }
        if (source.ApproverStatus != null) {
            this.ApproverStatus = new Long(source.ApproverStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "ApproverStatus", this.ApproverStatus);

    }
}

