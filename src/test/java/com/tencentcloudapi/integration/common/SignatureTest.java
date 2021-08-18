package com.tencentcloudapi.integration.common;

import org.junit.Test;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.cvm.v20170312.CvmClient;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesRequest;
import com.tencentcloudapi.cvm.v20170312.models.DescribeInstancesResponse;

import static org.junit.Assert.fail;

import org.junit.Assert;

public class SignatureTest {

  @Test
  public void testGetHmacSHA256() {
    Credential cred =
        new Credential(
            System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
    HttpProfile httpProfile = new HttpProfile();
    ClientProfile clientProfile = new ClientProfile();
    clientProfile.setHttpProfile(httpProfile);
    clientProfile.setSignMethod("HmacSHA256");
    httpProfile.setReqMethod("GET");
    CvmClient client = new CvmClient(cred, "ap-guangzhou", clientProfile);
    DescribeInstancesRequest req = new DescribeInstancesRequest();
    try {
      DescribeInstancesResponse resp = client.DescribeInstances(req);
      Assert.assertTrue(resp.getTotalCount() >= 0);
    } catch (TencentCloudSDKException e) {
      fail(e.toString());
    }
  }

  @Test
  public void testPostHmacSHA256() {
    Credential cred =
        new Credential(
            System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
    HttpProfile httpProfile = new HttpProfile();
    ClientProfile clientProfile = new ClientProfile();
    clientProfile.setHttpProfile(httpProfile);
    clientProfile.setSignMethod("HmacSHA256");
    httpProfile.setReqMethod("POST");
    CvmClient client = new CvmClient(cred, "ap-guangzhou", clientProfile);
    DescribeInstancesRequest req = new DescribeInstancesRequest();
    try {
      DescribeInstancesResponse resp = client.DescribeInstances(req);
      Assert.assertTrue(resp.getTotalCount() >= 0);
    } catch (TencentCloudSDKException e) {
      fail(e.toString());
    }
  }

  @Test
  public void testGetTC3HmacSHA256() {
    Credential cred =
        new Credential(
            System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
    HttpProfile httpProfile = new HttpProfile();
    ClientProfile clientProfile = new ClientProfile();
    clientProfile.setHttpProfile(httpProfile);
    clientProfile.setSignMethod("TC3-HMAC-SHA256");
    httpProfile.setReqMethod("GET");
    CvmClient client = new CvmClient(cred, "ap-guangzhou", clientProfile);
    DescribeInstancesRequest req = new DescribeInstancesRequest();
    try {
      DescribeInstancesResponse resp = client.DescribeInstances(req);
      Assert.assertTrue(resp.getTotalCount() >= 0);
    } catch (TencentCloudSDKException e) {
      fail(e.toString());
    }
  }

  @Test
  public void testPostTC3HmacSHA256() {
    Credential cred =
        new Credential(
            System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
    HttpProfile httpProfile = new HttpProfile();
    ClientProfile clientProfile = new ClientProfile();
    clientProfile.setHttpProfile(httpProfile);
    clientProfile.setSignMethod("TC3-HMAC-SHA256");
    httpProfile.setReqMethod("POST");
    CvmClient client = new CvmClient(cred, "ap-guangzhou", clientProfile);
    DescribeInstancesRequest req = new DescribeInstancesRequest();
    try {
      DescribeInstancesResponse resp = client.DescribeInstances(req);
      Assert.assertTrue(resp.getTotalCount() >= 0);
    } catch (TencentCloudSDKException e) {
      fail(e.toString());
    }
  }

  @Test
  public void testGetHmacSHA1() {
    Credential cred =
        new Credential(
            System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
    HttpProfile httpProfile = new HttpProfile();
    ClientProfile clientProfile = new ClientProfile();
    clientProfile.setHttpProfile(httpProfile);
    clientProfile.setSignMethod("HmacSHA1");
    httpProfile.setReqMethod("GET");
    CvmClient client = new CvmClient(cred, "ap-guangzhou", clientProfile);
    DescribeInstancesRequest req = new DescribeInstancesRequest();
    try {
      DescribeInstancesResponse resp = client.DescribeInstances(req);
      Assert.assertTrue(resp.getTotalCount() >= 0);
    } catch (TencentCloudSDKException e) {
      fail(e.toString());
    }
  }

  @Test
  public void testPostHmacSHA1() {
    Credential cred =
        new Credential(
            System.getenv("TENCENTCLOUD_SECRET_ID"), System.getenv("TENCENTCLOUD_SECRET_KEY"));
    HttpProfile httpProfile = new HttpProfile();
    ClientProfile clientProfile = new ClientProfile();
    clientProfile.setHttpProfile(httpProfile);
    clientProfile.setSignMethod("HmacSHA1");
    httpProfile.setReqMethod("POST");
    CvmClient client = new CvmClient(cred, "ap-guangzhou", clientProfile);
    DescribeInstancesRequest req = new DescribeInstancesRequest();
    try {
      DescribeInstancesResponse resp = client.DescribeInstances(req);
      Assert.assertTrue(resp.getTotalCount() >= 0);
    } catch (TencentCloudSDKException e) {
      fail(e.toString());
    }
  }
}
