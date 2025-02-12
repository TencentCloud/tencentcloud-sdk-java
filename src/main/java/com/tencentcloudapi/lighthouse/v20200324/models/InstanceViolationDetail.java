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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceViolationDetail extends AbstractModel {

    /**
    *  来源：RESTRICT：封禁、FREEZW：冻结
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 是否允许自助解封：1是，2否
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 违规类型
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 违规内容（URL、关联域名）
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get  来源：RESTRICT：封禁、FREEZW：冻结 
     * @return Source  来源：RESTRICT：封禁、FREEZW：冻结
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set  来源：RESTRICT：封禁、FREEZW：冻结
     * @param Source  来源：RESTRICT：封禁、FREEZW：冻结
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 是否允许自助解封：1是，2否 
     * @return State 是否允许自助解封：1是，2否
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 是否允许自助解封：1是，2否
     * @param State 是否允许自助解封：1是，2否
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 违规类型 
     * @return Reason 违规类型
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 违规类型
     * @param Reason 违规类型
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 违规内容（URL、关联域名） 
     * @return Content 违规内容（URL、关联域名）
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 违规内容（URL、关联域名）
     * @param Content 违规内容（URL、关联域名）
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public InstanceViolationDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceViolationDetail(InstanceViolationDetail source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

