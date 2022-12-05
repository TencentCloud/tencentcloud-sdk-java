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
package com.tencentcloudapi.gme.v20180711;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.gme.v20180711.models.*;

public class GmeClient extends AbstractClient{
    private static String endpoint = "gme.tencentcloudapi.com";
    private static String service = "gme";
    private static String version = "2018-07-11";

    public GmeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public GmeClient(Credential credential, String region, ClientProfile profile) {
        super(GmeClient.endpoint, GmeClient.version, credential, region, profile);
    }

    /**
     *用于创建年龄语音识别任务的接口，请求频率10次/秒。该接口目前通过白名单开放试用，如有需求，请提交工单申请。
</br>
<h4><b>接口功能说明：</b></h4>
<li>支持对语音文件进行检测，判断是否为未成年人。</li>
<li>支持批量提交检测子任务。检测子任务列表最多支持100个。</li>
</br>
<h4><b>音频文件限制说明：</b></h4>
<li>音频文件大小限制：10 M</li>
<li>音频文件时长限制：3分钟</li>
<li>音频文件格式支持的类型：.wav、.m4a、.amr、.mp3、.aac、.wma、.ogg</li>
</br>
     * @param req CreateAgeDetectTaskRequest
     * @return CreateAgeDetectTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAgeDetectTaskResponse CreateAgeDetectTask(CreateAgeDetectTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAgeDetectTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAgeDetectTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAgeDetectTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateApp)用于创建一个GME应用。
     * @param req CreateAppRequest
     * @return CreateAppResponse
     * @throws TencentCloudSDKException
     */
    public CreateAppResponse CreateApp(CreateAppRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAppResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAppResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户使用该接口可以创建语音消息转文本自学习模型，以供识别调用
     * @param req CreateCustomizationRequest
     * @return CreateCustomizationResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomizationResponse CreateCustomization(CreateCustomizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCustomizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCustomizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCustomization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增自定义送检用户
     * @param req CreateScanUserRequest
     * @return CreateScanUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateScanUserResponse CreateScanUser(CreateScanUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateScanUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateScanUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateScanUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过该接口可以删除语音消息转文本自学习模型
     * @param req DeleteCustomizationRequest
     * @return DeleteCustomizationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomizationResponse DeleteCustomization(DeleteCustomizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCustomizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCustomizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCustomization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DeleteRoomMember)用户删除房间或者剔除房间内用户
     * @param req DeleteRoomMemberRequest
     * @return DeleteRoomMemberResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoomMemberResponse DeleteRoomMember(DeleteRoomMemberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRoomMemberResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRoomMemberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRoomMember");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除自定义送检用户
     * @param req DeleteScanUserRequest
     * @return DeleteScanUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScanUserResponse DeleteScanUser(DeleteScanUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteScanUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteScanUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteScanUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询年龄语音识别任务结果，请求频率10次/秒。该接口目前通过白名单开放试用，如有需求，请提交工单申请。
     * @param req DescribeAgeDetectTaskRequest
     * @return DescribeAgeDetectTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgeDetectTaskResponse DescribeAgeDetectTask(DescribeAgeDetectTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgeDetectTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgeDetectTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAgeDetectTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeAppStatistics)用于获取某个GME应用的用量数据。包括实时语音，语音消息及转文本，语音分析等。最长查询周期为最近60天。
     * @param req DescribeAppStatisticsRequest
     * @return DescribeAppStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppStatisticsResponse DescribeAppStatistics(DescribeAppStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAppStatisticsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAppStatisticsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAppStatistics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeApplicationData)用于获取数据详情信息，最多可拉取最近90天的数据。
     * @param req DescribeApplicationDataRequest
     * @return DescribeApplicationDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationDataResponse DescribeApplicationData(DescribeApplicationDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeApplicationList)用于查询自己账号下的应用列表
     * @param req DescribeApplicationListRequest
     * @return DescribeApplicationListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationListResponse DescribeApplicationList(DescribeApplicationListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户自定义送检信息
     * @param req DescribeRealtimeScanConfigRequest
     * @return DescribeRealtimeScanConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealtimeScanConfigResponse DescribeRealtimeScanConfig(DescribeRealtimeScanConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealtimeScanConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealtimeScanConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRealtimeScanConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取房间内用户信息
     * @param req DescribeRoomInfoRequest
     * @return DescribeRoomInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoomInfoResponse DescribeRoomInfo(DescribeRoomInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRoomInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoomInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRoomInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeScanResultList)用于查询语音检测结果，查询任务列表最多支持100个。
<p style="color:red">如果在提交语音检测任务时未设置 Callback 字段，则需要通过本接口获取检测结果</p>
     * @param req DescribeScanResultListRequest
     * @return DescribeScanResultListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanResultListResponse DescribeScanResultList(DescribeScanResultListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScanResultListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScanResultListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScanResultList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取用户在房间得进出时间
     * @param req DescribeUserInAndOutTimeRequest
     * @return DescribeUserInAndOutTimeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserInAndOutTimeResponse DescribeUserInAndOutTime(DescribeUserInAndOutTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserInAndOutTimeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserInAndOutTimeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserInAndOutTime");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询语音消息转文本自学习模型列表
     * @param req GetCustomizationListRequest
     * @return GetCustomizationListResponse
     * @throws TencentCloudSDKException
     */
    public GetCustomizationListResponse GetCustomizationList(GetCustomizationListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCustomizationListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetCustomizationListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCustomizationList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyAppStatus)用于修改应用总开关状态。
     * @param req ModifyAppStatusRequest
     * @return ModifyAppStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAppStatusResponse ModifyAppStatus(ModifyAppStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAppStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAppStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAppStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过该接口可以更新语音消息转文本自学习模型。
     * @param req ModifyCustomizationRequest
     * @return ModifyCustomizationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomizationResponse ModifyCustomization(ModifyCustomizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCustomizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCustomization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过该接口，用户可以修改语音消息转文本自学习模型状态，上下线自学习模型
     * @param req ModifyCustomizationStateRequest
     * @return ModifyCustomizationStateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomizationStateResponse ModifyCustomizationState(ModifyCustomizationStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomizationStateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCustomizationStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCustomizationState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     ***接口作用**：此接口用于修改房间用户的麦克风状态，例如房间内用户麦克风为打开状态，可调用此接口将该用户麦克风进行关闭，关闭后即使该用户使用客户端接口 EnableMic 打开麦克风，依然无法与房间内成员通话，属于被禁言状态。该状态持续到此用户退房后失效，或者调用该接口重新打开此用户麦克风状态。
**接口应用场景**：此接口多用于游戏业务中台或者风控后台，对一些发表不当言论的玩家进行禁言处理。
**接口使用前提**：目前 ModifyUserMicStatus 接口通过白名单开放，如需使用，需要 [提交工单申请](https://console.cloud.tencent.com/workorder/category?level1_id=438&level2_id=445&source=0&data_title=%E6%B8%B8%E6%88%8F%E5%A4%9A%E5%AA%92%E4%BD%93%E5%BC%95%E6%93%8EGME&step=1)。
     * @param req ModifyUserMicStatusRequest
     * @return ModifyUserMicStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserMicStatusResponse ModifyUserMicStatus(ModifyUserMicStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUserMicStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUserMicStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUserMicStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ScanVoice)用于提交语音检测任务，检测任务列表最多支持100个。使用前请您登录[控制台 - 服务配置](https://console.cloud.tencent.com/gamegme/conf)开启语音内容安全服务。
</br></br>

<h4><b>功能试用说明：</b></h4>
<li>打开前往<a href="https://console.cloud.tencent.com/gamegme/tryout">控制台 - 产品试用</a>免费试用语音内容安全服务。</li>
</br>

<h4><b>接口功能说明：</b></h4>
<li>支持对语音流或语音文件进行检测，判断其中是否包含违规内容。</li>
<li>支持设置回调地址 Callback 获取检测结果，同时支持通过接口(查询语音检测结果)主动轮询获取检测结果。</li>
<li>支持场景输入，包括：谩骂、色情等场景</li>
<li>支持批量提交检测任务。检测任务列表最多支持100个。</li>
</br>
<h4><b>音频文件限制说明：</b></h4>
<li>音频文件大小限制：100 M</li>
<li>音频文件时长限制：30分钟</li>
<li>音频文件格式支持的类型：.wav、.m4a、.amr、.mp3、.aac、.wma、.ogg</li>
</br>
<h4><b>语音流限制说明：</b></h4>
<li>语音流格式支持的类型：.m3u8、.flv</li>
<li>语音流支持的传输协议：RTMP、HTTP、HTTPS</li>
<li>语音流时长限制：4小时</li>
<li>支持音视频流分离并对音频流进行分析</li>
</br>
<h4 id="Label_Value"><b>Scenes 与 Label 参数说明：</b></h4>
<p>提交语音检测任务时，需要指定 Scenes 场景参数，<font color="red">目前要求您设置 Scenes 参数值为：["default"]</font>；而在检测结果中，则包含请求时指定的场景，以及对应类型的检测结果。</p>
<table>
<thread>
<tr>
<th>场景</th>
<th>描述</th>
<th>Label</th>
</tr>
</thread>
<tbody>
<tr>
<td>语音检测</td>
<td>语音检测的检测类型</td>
<td>
<p>normal:正常文本</p>
<p>porn:色情</p>
<p>abuse:谩骂</p>
<p>ad :广告</p>
<p>illegal :违法</p>
<p>moan :呻吟</p>
<p>customized:自定义词库</p>
</td>
</tr>
</tbody>
</table>
</br>
<h4 id="Callback_Declare"><b>回调相关说明：</b></h4>
<li>如果在请求参数中指定了回调地址参数 Callback，即一个 HTTP(S) 协议接口的 URL，则需要支持 POST 方法，传输数据编码采用 UTF-8。</li>
<li>在推送回调数据后，接收到的 HTTP 状态码为 200 时，表示推送成功。</li>
<li>HTTP 头参数说明：</li>
<table>
<thread>
<tr>
<th>名称</th>
<th>类型</th>
<th>是否必需</th>
<th>描述</th>
</tr>
</thread>
<tbody>
<tr>
<td>Signatue</td>
<td>string</td>
<td>是</td>
<td>签名，具体见<a href="#Callback_Signatue">签名生成说明</a></td>
</tr>
</tbody>
</table>
<ul  id="Callback_Signatue">
	<li>签名生成说明：</li>
	<ul>
		<li>使用 HMAC-SH1 算法, 最终结果做 BASE64 编码;</li>
		<li>签名原文串为 POST+body 的整个json内容(长度以 Content-Length 为准);</li>
		<li>签名key为应用的 SecretKey，可以通过控制台查看。</li>
	</ul>
</ul>

<li>回调示例如下<font color="red">（详细字段说明见结构：
<a href="https://cloud.tencent.com/document/api/607/35375#DescribeScanResult" target="_blank">DescribeScanResult</a>）</font>：</li>
<pre><code>{
	"Code": 0,
	"DataId": "1400000000_test_data_id",
	"ScanFinishTime": 1566720906,
	"HitFlag": true,
	"Live": false,
	"Msg": "",
	"ScanPiece": [{
		"DumpUrl": "",
		"HitFlag": true,
		"MainType": "abuse",
		"RoomId": "123",
		"OpenId": "xxx",
		"Info":"",
		"Offset": 0,
		"Duration": 3400,
		"PieceStartTime":1574684231,
		"ScanDetail": [{
			"EndTime": 1110,
			"KeyWord": "xxx",
			"Label": "abuse",
			"Rate": "90.00",
			"StartTime": 1110
		}, {
			"EndTime": 1380,
			"KeyWord": "xxx",
			"Label": "abuse",
			"Rate": "90.00",
			"StartTime": 930
		}, {
			"EndTime": 1560,
			"KeyWord": "xxx",
			"Label": "abuse",
			"Rate": "90.00",
			"StartTime": 930
		}, {
			"EndTime": 2820,
			"KeyWord": "xxx",
			"Label": "abuse",
			"Rate": "90.00",
			"StartTime": 2490
		}]
	}],
	"ScanStartTime": 1566720905,
	"Scenes": [
		"default"
	],
	"Status": "Success",
	"TaskId": "xxx",
	"Url": "https://xxx/xxx.m4a"
}
</code></pre>
     * @param req ScanVoiceRequest
     * @return ScanVoiceResponse
     * @throws TencentCloudSDKException
     */
    public ScanVoiceResponse ScanVoice(ScanVoiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanVoiceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ScanVoiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScanVoice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新自定义送检房间号
     * @param req UpdateScanRoomsRequest
     * @return UpdateScanRoomsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateScanRoomsResponse UpdateScanRooms(UpdateScanRoomsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateScanRoomsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateScanRoomsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateScanRooms");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新自定义送检用户号
     * @param req UpdateScanUsersRequest
     * @return UpdateScanUsersResponse
     * @throws TencentCloudSDKException
     */
    public UpdateScanUsersResponse UpdateScanUsers(UpdateScanUsersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateScanUsersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateScanUsersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateScanUsers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
