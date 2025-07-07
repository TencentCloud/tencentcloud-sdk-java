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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HandleMediaCastProjectRequest extends AbstractModel {

    /**
    * 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 媒体转推项目 Id 。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 请参考 [操作类型](#Operation)。
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 输入源信息。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 AddSource、DeleteSource、SwitchSource 时必填。
    */
    @SerializedName("SourceInfos")
    @Expose
    private MediaCastSourceInfo [] SourceInfos;

    /**
    * 输出源信息。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 AddDestination、DeleteDestination、EnableDestination、DisableDestination、ModifyDestination 时必填。
    */
    @SerializedName("DestinationInfos")
    @Expose
    private MediaCastDestinationInfo [] DestinationInfos;

    /**
    * 输出媒体配置。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 ModifyOutputSetting 时必填。
    */
    @SerializedName("OutputMediaSetting")
    @Expose
    private MediaCastOutputMediaSetting OutputMediaSetting;

    /**
    * 播放控制参数。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 ModifyPlaySetting 时必填。
    */
    @SerializedName("PlaySetting")
    @Expose
    private MediaCastPlaySetting PlaySetting;

    /**
    * 新添加的输入源位于输入源列表的位置，从0开始。默认加在输入源列表的后面。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 AddSource 时必填。
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以操作所有媒体转推项目。如果指定操作者，则操作者必须为项目所有者。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。 
     * @return Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     * @param Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 媒体转推项目 Id 。 
     * @return ProjectId 媒体转推项目 Id 。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 媒体转推项目 Id 。
     * @param ProjectId 媒体转推项目 Id 。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 请参考 [操作类型](#Operation)。 
     * @return Operation 请参考 [操作类型](#Operation)。
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 请参考 [操作类型](#Operation)。
     * @param Operation 请参考 [操作类型](#Operation)。
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 输入源信息。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 AddSource、DeleteSource、SwitchSource 时必填。 
     * @return SourceInfos 输入源信息。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 AddSource、DeleteSource、SwitchSource 时必填。
     */
    public MediaCastSourceInfo [] getSourceInfos() {
        return this.SourceInfos;
    }

    /**
     * Set 输入源信息。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 AddSource、DeleteSource、SwitchSource 时必填。
     * @param SourceInfos 输入源信息。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 AddSource、DeleteSource、SwitchSource 时必填。
     */
    public void setSourceInfos(MediaCastSourceInfo [] SourceInfos) {
        this.SourceInfos = SourceInfos;
    }

    /**
     * Get 输出源信息。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 AddDestination、DeleteDestination、EnableDestination、DisableDestination、ModifyDestination 时必填。 
     * @return DestinationInfos 输出源信息。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 AddDestination、DeleteDestination、EnableDestination、DisableDestination、ModifyDestination 时必填。
     */
    public MediaCastDestinationInfo [] getDestinationInfos() {
        return this.DestinationInfos;
    }

    /**
     * Set 输出源信息。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 AddDestination、DeleteDestination、EnableDestination、DisableDestination、ModifyDestination 时必填。
     * @param DestinationInfos 输出源信息。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 AddDestination、DeleteDestination、EnableDestination、DisableDestination、ModifyDestination 时必填。
     */
    public void setDestinationInfos(MediaCastDestinationInfo [] DestinationInfos) {
        this.DestinationInfos = DestinationInfos;
    }

    /**
     * Get 输出媒体配置。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 ModifyOutputSetting 时必填。 
     * @return OutputMediaSetting 输出媒体配置。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 ModifyOutputSetting 时必填。
     */
    public MediaCastOutputMediaSetting getOutputMediaSetting() {
        return this.OutputMediaSetting;
    }

    /**
     * Set 输出媒体配置。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 ModifyOutputSetting 时必填。
     * @param OutputMediaSetting 输出媒体配置。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 ModifyOutputSetting 时必填。
     */
    public void setOutputMediaSetting(MediaCastOutputMediaSetting OutputMediaSetting) {
        this.OutputMediaSetting = OutputMediaSetting;
    }

    /**
     * Get 播放控制参数。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 ModifyPlaySetting 时必填。 
     * @return PlaySetting 播放控制参数。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 ModifyPlaySetting 时必填。
     */
    public MediaCastPlaySetting getPlaySetting() {
        return this.PlaySetting;
    }

    /**
     * Set 播放控制参数。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 ModifyPlaySetting 时必填。
     * @param PlaySetting 播放控制参数。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 ModifyPlaySetting 时必填。
     */
    public void setPlaySetting(MediaCastPlaySetting PlaySetting) {
        this.PlaySetting = PlaySetting;
    }

    /**
     * Get 新添加的输入源位于输入源列表的位置，从0开始。默认加在输入源列表的后面。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 AddSource 时必填。 
     * @return Position 新添加的输入源位于输入源列表的位置，从0开始。默认加在输入源列表的后面。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 AddSource 时必填。
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set 新添加的输入源位于输入源列表的位置，从0开始。默认加在输入源列表的后面。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 AddSource 时必填。
     * @param Position 新添加的输入源位于输入源列表的位置，从0开始。默认加在输入源列表的后面。具体操作方式详见 [操作类型](#Operation) 及下文示例。
当 Operation 为 AddSource 时必填。
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以操作所有媒体转推项目。如果指定操作者，则操作者必须为项目所有者。 
     * @return Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以操作所有媒体转推项目。如果指定操作者，则操作者必须为项目所有者。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以操作所有媒体转推项目。如果指定操作者，则操作者必须为项目所有者。
     * @param Operator 操作者。如不填，默认为 `cmeid_system`，表示平台管理员操作，可以操作所有媒体转推项目。如果指定操作者，则操作者必须为项目所有者。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public HandleMediaCastProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HandleMediaCastProjectRequest(HandleMediaCastProjectRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.SourceInfos != null) {
            this.SourceInfos = new MediaCastSourceInfo[source.SourceInfos.length];
            for (int i = 0; i < source.SourceInfos.length; i++) {
                this.SourceInfos[i] = new MediaCastSourceInfo(source.SourceInfos[i]);
            }
        }
        if (source.DestinationInfos != null) {
            this.DestinationInfos = new MediaCastDestinationInfo[source.DestinationInfos.length];
            for (int i = 0; i < source.DestinationInfos.length; i++) {
                this.DestinationInfos[i] = new MediaCastDestinationInfo(source.DestinationInfos[i]);
            }
        }
        if (source.OutputMediaSetting != null) {
            this.OutputMediaSetting = new MediaCastOutputMediaSetting(source.OutputMediaSetting);
        }
        if (source.PlaySetting != null) {
            this.PlaySetting = new MediaCastPlaySetting(source.PlaySetting);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamArrayObj(map, prefix + "SourceInfos.", this.SourceInfos);
        this.setParamArrayObj(map, prefix + "DestinationInfos.", this.DestinationInfos);
        this.setParamObj(map, prefix + "OutputMediaSetting.", this.OutputMediaSetting);
        this.setParamObj(map, prefix + "PlaySetting.", this.PlaySetting);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

